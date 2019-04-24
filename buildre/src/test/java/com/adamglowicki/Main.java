package com.adamglowicki;

import com.adamglowicki.house.Home;
import com.adamglowicki.house.HouseDirector;
import com.adamglowicki.house.SmallHouseBuilder;

public class Main {
    public static void main(String[] args) {
//        Home home1 = new Home("wall", "floor", "room");

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);

    }
}
