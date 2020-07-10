package com.playalong.ParkingLot.Strategy.SlotAllocation;

import com.playalong.ParkingLot.Constants.VehicleType;
import com.playalong.ParkingLot.Service.ParkingSlotService;
import com.playalong.ParkingLot.dao.ParkingSlot;

public class DefaultSlotAllocationStrategy implements SlotAllocationStrategy {

    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType) {
        return ParkingSlotService
                .getInstance()
                .getUnOccupiedParkingLotByVehicleType(vehicleType)
                .get(0);
    }
}
