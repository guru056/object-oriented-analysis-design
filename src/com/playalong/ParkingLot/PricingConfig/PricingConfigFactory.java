package com.playalong.ParkingLot.PricingConfig;

import com.playalong.ParkingLot.Constants.VehicleType;

public class PricingConfigFactory {

    public static PricingConfig getPricingConfigObject(VehicleType vehicleType)
    {
        switch (vehicleType) {
            case FOUR_WHEELER:
                return FourWheelerPricingConfig.getInstance();
            case TWO_WHEELER:
            default:
                return TwoWheelerPricingConfig.getInstance();
        }
    }
}
