package com.pattern.task;

import java.time.LocalDate;

public class ContinentalFactory implements Factory {

    private static final FuelType DISEL = FuelType.DISEL;
    private static final FuelType GAS = FuelType.DISEL;

    @Override
    public Car buildFord(FordType type, int volumeEngine,
                         FuelType fuelType,
                         LocalDate productionDate,
                         SteeringWheelPosition position) {
                return new Ford(type, volumeEngine, fuelType, productionDate, position);
        }

    @Override
    public Car buildBMW(BMWType type) {
        return null;
    }
}
