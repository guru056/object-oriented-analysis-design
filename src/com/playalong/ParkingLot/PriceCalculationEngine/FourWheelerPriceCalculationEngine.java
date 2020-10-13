package com.playalong.ParkingLot.PriceCalculationEngine;

import com.playalong.ParkingLot.Util.DateTimeUtil;
import com.playalong.ParkingLot.dao.Ticket;

public class FourWheelerPriceCalculationEngine extends PriceCalculationEngine{


    public FourWheelerPriceCalculationEngine(Ticket ticket) {
        super(ticket);
    }

    @Override
    public double calculateTotalPrice()
    {
        long parkingTimeInSeconds = DateTimeUtil.getTimeDifferenceInSeconds(this.ticket.getEntryTime(),this.ticket.getExitTime());
        long parkingTimeInHours = ( parkingTimeInSeconds / (60 * 60 ) );
        double totalCost =  parkingTimeInHours * pricingConfig.getChargesPerHour();
        return totalCost;
    }
}
