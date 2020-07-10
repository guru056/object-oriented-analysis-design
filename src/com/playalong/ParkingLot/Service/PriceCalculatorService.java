package com.playalong.ParkingLot.Service;

import com.playalong.ParkingLot.Strategy.PriceCalculation.DefaultPriceCalculationStrategy;
import com.playalong.ParkingLot.Strategy.PriceCalculation.PriceCalculationStrategy;
import com.playalong.ParkingLot.Util.DateTimeUtil;
import com.playalong.ParkingLot.dao.Ticket;

public class PriceCalculatorService {

    private static PriceCalculatorService priceCalculatorService;

    private PriceCalculatorService() {}

    public static PriceCalculatorService getInstance()
    {
        if (priceCalculatorService == null) {
            return new PriceCalculatorService();
        }
        return priceCalculatorService;
    }

    public double calculatePrice(Ticket ticket)
    {
        double totalCost =  this.getPriceCalculationStrategy().calculatePrice(ticket);
        ticket.setAmount(totalCost);

        return totalCost;
    }

    private PriceCalculationStrategy getPriceCalculationStrategy()
    {
        return new DefaultPriceCalculationStrategy();
    }

}
