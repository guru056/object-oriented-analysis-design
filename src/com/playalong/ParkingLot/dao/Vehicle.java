package com.playalong.ParkingLot.dao;

import com.playalong.ParkingLot.Constants.VehicleType;

public class Vehicle {

    private String registrationNumber;
    private VehicleType vehicleType;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Vehicle setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
}
