package com.adamglowicki.house;

public class SmallHouseBuilder implements HouseBuilder {

    private Home home;

    public SmallHouseBuilder() {
        this.home = new Home();
    }


    public void buildWalls() {
        this.home.setWalls("Small Walls");
    }

    public void buildFloors() {
        this.home.setFloors("Small floors");
    }

    public void buildRooms() {
        this.home.setRooms("Small rooms");
    }

    public void buildRoof() {
        this.home.setRoof("Small roof");
    }

    public void buildDoors() {
        this.home.setDoors("Small doors");
    }

    public void buildWindows() {
        this.home.setWindows("Small windows");
    }

    public void buildGarage() {
        this.home.setGarage("Small garage");
    }

    public Home getHome() {
        return home;
    }
}
