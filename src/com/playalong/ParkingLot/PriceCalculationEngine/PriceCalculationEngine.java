package com.playalong.ParkingLot.PriceCalculationEngine;

import com.playalong.ParkingLot.PricingConfig.PricingConfig;
import com.playalong.ParkingLot.PricingConfig.PricingConfigFactory;
import com.playalong.ParkingLot.dao.Ticket;

public abstract class PriceCalculationEngine {

    protected PricingConfig pricingConfig;
    protected Ticket ticket;

    public PriceCalculationEngine(Ticket ticket) {
        this.ticket = ticket;
        this.pricingConfig = PricingConfigFactory.getPricingConfigObject(this.ticket.getVehicle().getVehicleType());
    }

    public abstract double calculateTotalPrice();
}
