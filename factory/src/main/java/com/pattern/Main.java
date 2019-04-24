package com.pattern;

public class Main {


    public static void main(String[] args) {
        InfantryFactory infantryFactory = new UnitInfantryFactory();
        InfantryUnit rifleman = infantryFactory.createUnit(UnitType.RIFLEMAN);
        InfantryUnit tank = infantryFactory.createUnit(UnitType.TANK);

    }
}
