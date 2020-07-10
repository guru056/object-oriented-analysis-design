package com.playalong.ParkingLot;

public class Constants {

    public enum SlotState {
        OCCUPIED,
        UNOCCUPIED,
        OUT_OF_SERVICE,
        UNDER_REPAIR
    }

    public enum VehicleType {
        TWO_WHEELER,
        FOUR_WHEELER
    }

    public enum TicketState {
        ACTIVE,
        RESOLVED,
        LOST
    }
}
