package com.playalong.ParkingLot.Service;

import com.playalong.ParkingLot.Constants.VehicleType;
import com.playalong.ParkingLot.Strategy.SlotAllocation.DefaultSlotAllocationStrategy;
import com.playalong.ParkingLot.Strategy.SlotAllocation.SlotAllocationStrategy;
import com.playalong.ParkingLot.dao.ParkingSlot;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlotService {

    private static ParkingSlotService parkingSlotService;

    private ParkingSlotService(){}

    public static ParkingSlotService getInstance() {
        if (parkingSlotService == null) {
            return new ParkingSlotService();
        }
        return parkingSlotService;
    }


    public List<ParkingSlot> getUnOccupiedParkingLotByVehicleType(VehicleType vehicleType)
    {
        //ParkingSlotRepository.findByStateAndVehicleType.
        ParkingSlot dummySlot =  new ParkingSlot();
        List<ParkingSlot> listOfSlots = new ArrayList<>();
        listOfSlots.add(dummySlot);
        return listOfSlots;
    }

    public ParkingSlot getParkingSlotForVehicle(VehicleType vehicleType)
    {
        return getSlotAllocationStrategy(vehicleType).getParkingSlot(vehicleType);
    }

    private SlotAllocationStrategy getSlotAllocationStrategy(VehicleType vehicleType)
    {
        //other possible strategies:
        //   - Nearest to the entry gate
        //   - Nearest to the exit gate
        return new DefaultSlotAllocationStrategy();
    }
}
