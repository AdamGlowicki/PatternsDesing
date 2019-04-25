package com.pattern.task;

import java.time.LocalDate;

public interface Factory {

    Car buildFord(FordType type,
                  int volumeEngine,
                  FuelType fuelType,
                  LocalDate productionDate,
                  SteeringWheelPosition position);

    Car buildBMW(BMWType type,
                 int volumeEngine,
                 FuelType fuelType,
                 LocalDate productionDate,
                 SteeringWheelPosition position);
}
