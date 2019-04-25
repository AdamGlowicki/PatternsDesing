package com.pattern.task;

import java.time.LocalDate;

public abstract class Car {

    private int volumeEngine;
    private FuelType fuelType;
    private LocalDate productionDate;
    private SteeringWheelPosition position;

    public Car(int volumeEngine, FuelType fuelType, LocalDate productionDate, SteeringWheelPosition position) {
        this.volumeEngine = volumeEngine;
        this.fuelType = fuelType;
        this.productionDate = productionDate;
        this.position = position;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(int volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }

    public void setPosition(SteeringWheelPosition position) {
        this.position = position;
    }
}
