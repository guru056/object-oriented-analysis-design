package com.playalong.ParkingLot.Controllers;

import com.playalong.ParkingLot.Constants;
import com.playalong.ParkingLot.Request.GenerateTicketRequest;
import com.playalong.ParkingLot.Service.ParkingSlotService;
import com.playalong.ParkingLot.Service.PriceCalculatorService;
import com.playalong.ParkingLot.Service.TicketService;
import com.playalong.ParkingLot.dao.ParkingSlot;
import com.playalong.ParkingLot.dao.Ticket;

public class TicketController {

    private TicketService ticketService;

    public TicketController() {
        ticketService = TicketService.getInstance();
    }

    public Ticket generateTicket(GenerateTicketRequest request)
    {
        //call this after request validations
        return ticketService.generateNewTicket(request);
    }

    public double resolveTicket(long ticketId)
    {
        //call this after validations
        return ticketService.resolveTicket(ticketId);
    }
}
