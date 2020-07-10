package com.playalong.ParkingLot.PricingConfig;

public class TwoWheelerPricingConfig extends PricingConfig {

    private static TwoWheelerPricingConfig twoWheelerPricingConfig;

    private TwoWheelerPricingConfig()
    {
    }

    public static TwoWheelerPricingConfig getInstance() {
        if (twoWheelerPricingConfig == null) {
            twoWheelerPricingConfig = new TwoWheelerPricingConfig();
            twoWheelerPricingConfig.chargesPerHour = fetchChargePerHourFromDB();
            return twoWheelerPricingConfig;
        }
        return twoWheelerPricingConfig;
    }

    private static double fetchChargePerHourFromDB()
    {
        //repository.getByVehicleType
        //returning dummy price
        return 20.00;
    }
}
