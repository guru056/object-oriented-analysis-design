package com.playalong.ParkingLot.PriceCalculationEngine;

import com.playalong.ParkingLot.dao.Ticket;

public class PriceCalculationEngineFactory {


    public static PriceCalculationEngine getPriceCalculationEngineObject(Ticket ticket)
    {
        switch (ticket.getVehicle().getVehicleType()) {
            case FOUR_WHEELER:
                return new FourWheelerPriceCalculationEngine(ticket);
            case TWO_WHEELER:
            default:
                return new TwoWheelerPriceCalculationEngine(ticket);
        }
    }
}
