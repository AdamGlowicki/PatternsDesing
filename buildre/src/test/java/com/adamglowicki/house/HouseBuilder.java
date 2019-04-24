package com.adamglowicki.house;

public interface HouseBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildDoors();
    void buildWindows();
    void buildGarage();

    Home getHome();
}
