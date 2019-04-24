package com.pattern;

public class BlueFactory extends Factory {

    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(25, 0, 10);
            default:
                throw new UnsupportedOperationException("Unknow type");
        }
    }

    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(200, 0, 50);
            default:
                throw new UnsupportedOperationException("Unknow type");
        }
    }
}
