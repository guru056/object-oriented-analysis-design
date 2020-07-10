package com.playalong.ParkingLot.Request;

import com.playalong.ParkingLot.dao.Customer;
import com.playalong.ParkingLot.dao.Vehicle;

public class GenerateTicketRequest {

    private Vehicle vehicle;
    private Customer customer;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
