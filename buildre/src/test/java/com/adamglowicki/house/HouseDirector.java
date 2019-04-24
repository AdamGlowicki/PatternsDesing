package com.adamglowicki.house;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildRoof();
        houseBuilder.buildDoors();
        houseBuilder.buildWindows();
        houseBuilder.buildGarage();
    }

    public Home getHome() {
        return this.houseBuilder.getHome();
    }
}
