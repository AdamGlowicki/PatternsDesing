package com.adamglowicki.FlightLeg;

public class FlightDirector {

    FlightBuilder flightBuilder;

    public FlightDirector(FlightBuilder flightBuilder) {
        this.flightBuilder = flightBuilder;
    }

    public void flightBuilder() {
        flightBuilder.buildFrom();
        flightBuilder.buildTo();
        flightBuilder.buildDelayed();
        flightBuilder.buildPrice();
    }

    public FlightLeg getFlightFeg() {
        return this.flightBuilder.getFlightLeg();
    }
}
