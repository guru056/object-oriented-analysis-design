package com.playalong.ParkingLot.dao;

import com.playalong.ParkingLot.Constants.TicketState;

public class Ticket {

    private long ticketId;
    private TicketState ticketState;
    private Vehicle vehicle;
    private String entryTime;
    private String exitTime;
    private Customer customer;
    private ParkingSlot parkingSlot;
    private double amount;

    public long getTicketId() {
        return ticketId;
    }

    public Ticket setTicketId(long ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    public TicketState getTicketState() {
        return ticketState;
    }

    public Ticket setTicketState(TicketState ticketState) {
        this.ticketState = ticketState;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Ticket setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public Ticket setEntryTime(String entryTime) {
        this.entryTime = entryTime;
        return this;
    }

    public String getExitTime() {
        return exitTime;
    }

    public Ticket setExitTime(String exitTime) {
        this.exitTime = exitTime;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Ticket setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public Ticket setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
        return this;

    }

    public double getAmount() {
        return amount;
    }

    public Ticket setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}
