package com.playalong.ParkingLot.PricingConfig;

public class FourWheelerPricingConfig extends PricingConfig{

    private static FourWheelerPricingConfig fourWheelerPricingConfig;

    private FourWheelerPricingConfig()
    {
    }

    public static FourWheelerPricingConfig getInstance() {
        if (fourWheelerPricingConfig == null) {
            fourWheelerPricingConfig = new FourWheelerPricingConfig();
            fourWheelerPricingConfig.chargesPerHour = fetchChargePerHourFromDB();
            return fourWheelerPricingConfig;
        }
        return fourWheelerPricingConfig;
    }

    private static double fetchChargePerHourFromDB()
    {
        //repository.getByVehicleType
        //returning dummy price
        return 40.00;
    }
}
