package com.pattern;

public class UnitInfantryFactory extends InfantryFactory {
    public InfantryUnit createUnit(UnitType unitType) {

        switch (unitType) {
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(50, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
