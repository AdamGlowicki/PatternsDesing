package com.pattern;

public class Main {


    public static void main(String[] args) {
        Factory blurFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        InfantryUnit blueRifleman = blurFactory.createInfantryUnit(UnitType.RIFLEMAN);
        MechanizedUnit blueTank = blurFactory.createMechanizedUnit(UnitType.TANK);

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redRifleman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

    }
}
