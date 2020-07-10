package com.playalong.ParkingLot.Strategy.PriceCalculation;

import com.playalong.ParkingLot.dao.Ticket;

public interface PriceCalculationStrategy {

    public double calculatePrice(Ticket ticket);
}
