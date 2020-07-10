package com.playalong.ParkingLot.Strategy.PriceCalculation;

import com.playalong.ParkingLot.PricingConfig.PricingConfig;
import com.playalong.ParkingLot.PricingConfig.PricingConfigFactory;
import com.playalong.ParkingLot.Util.DateTimeUtil;
import com.playalong.ParkingLot.dao.Ticket;

public class DefaultPriceCalculationStrategy implements PriceCalculationStrategy {

    @Override
    public double calculatePrice(Ticket ticket) {
        PricingConfig pricingConfig = PricingConfigFactory.getPricingConfigObject(ticket.getVehicle().getVehicleType());

        long parkingTimeInSeconds = DateTimeUtil.getTimeDifferenceInSeconds(ticket.getEntryTime(),ticket.getExitTime());
        long parkingTimeInHours = ( parkingTimeInSeconds / (60 * 60 ) );

        double totalCost =  parkingTimeInHours * pricingConfig.getChargesPerHour();
        return totalCost;
    }
}
