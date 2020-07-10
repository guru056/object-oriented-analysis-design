package com.playalong.ParkingLot.dao;

import com.playalong.ParkingLot.Constants;
import com.playalong.ParkingLot.Constants.VehicleType;
import com.playalong.ParkingLot.Constants.SlotState;

public class ParkingSlot {

    private int id;
    private int floor;
    private VehicleType vehicleType;
    private SlotState slotState;

    public int getId() {
        return id;
    }

    public ParkingSlot setId(int id) {
        this.id = id;
        return this;
    }

    public int getFloor() {
        return floor;
    }

    public ParkingSlot setFloor(int floor) {
        this.floor = floor;
        return this;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingSlot setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public SlotState getSlotState() {
        return slotState;
    }

    public ParkingSlot setSlotState(SlotState slotState) {
        this.slotState = slotState;
        return this;
    }
}
