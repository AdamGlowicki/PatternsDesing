package com.pattern;

public class RedFactory extends Factory {

    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(30, 0, 8);
            default:
                throw new UnsupportedOperationException("Unknow type");
        }
    }

    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(250, 0, 100);
            default:
                throw new UnsupportedOperationException("Unknow type");
        }
    }
}

