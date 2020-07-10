package com.playalong.ParkingLot.Service;

import com.playalong.ParkingLot.Constants;
import com.playalong.ParkingLot.Request.GenerateTicketRequest;
import com.playalong.ParkingLot.Util.DateTimeUtil;
import com.playalong.ParkingLot.dao.ParkingSlot;
import com.playalong.ParkingLot.dao.Ticket;

public class TicketService {

    private ParkingSlotService parkingSlotService;
    private PriceCalculatorService priceCalculatorService;
    private static TicketService ticketService;

    private TicketService(){

    }

    public static TicketService getInstance() {
        if (ticketService == null) {
            ticketService =  new TicketService();
            ticketService.priceCalculatorService = PriceCalculatorService.getInstance();
            ticketService.parkingSlotService = ParkingSlotService.getInstance();
        }
        return ticketService;
    }

    public Ticket getTicketById(long ticketId)
    {
//        Ticket ticket = TicketRepository.getById();
        Ticket dummyTicket = new Ticket();
        return dummyTicket;
    }

    public Ticket generateNewTicket(GenerateTicketRequest request)
    {
        ParkingSlot allocatedSlot = this.parkingSlotService.getParkingSlotForVehicle(request.getVehicle().getVehicleType());

        allocatedSlot.setSlotState(Constants.SlotState.OCCUPIED);

        Ticket ticket = new Ticket();
        ticket.setParkingSlot(allocatedSlot);
        //set other params of ticket from the request

        return ticket;
    }

    public double resolveTicket(long ticketId)
    {
        Ticket ticket = this.getTicketById(ticketId);
        if (ticket.getAmount() != 0 || ticket.getParkingSlot().getSlotState() == Constants.SlotState.UNOCCUPIED) {
            return ticket.getAmount();
        }

        String exitTime = DateTimeUtil.getCurrentTimestamp();
        ticket.setExitTime(exitTime);

        double totalCost =  this.priceCalculatorService.calculatePrice(ticket);
        ticket.setAmount(totalCost);
        ticket.setParkingSlot(ticket.getParkingSlot().setSlotState(Constants.SlotState.UNOCCUPIED));

        return totalCost;
    }


}
