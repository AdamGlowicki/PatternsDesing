package com.adamglowicki.FlightLeg;

public class NewYorkFlightBuilder implements FlightBuilder {

    FlightLeg flightLeg;

    public NewYorkFlightBuilder() {
        flightLeg = new FlightLeg();
    }

    public void buildFrom() {
        flightLeg.setFrom("NewYork");
    }

    public void buildTo() {
        flightLeg.setTo("Warsaw");
    }

    public void buildDelayed() {
        flightLeg.setDelayed("0");
    }

    public void buildPrice() {
        flightLeg.setPrice("3000");
    }

    public FlightLeg getFlightLeg() {
        return flightLeg;
    }
}
