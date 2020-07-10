package com.playalong.ParkingLot.Strategy.SlotAllocation;

import com.playalong.ParkingLot.Constants.VehicleType;
import com.playalong.ParkingLot.dao.ParkingSlot;

public interface SlotAllocationStrategy {

    public ParkingSlot getParkingSlot(VehicleType vehicleType);
}
