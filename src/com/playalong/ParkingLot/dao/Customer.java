package com.playalong.ParkingLot.dao;

public class Customer {
    private String name;
    private String phoneNo;

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Customer setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
}
