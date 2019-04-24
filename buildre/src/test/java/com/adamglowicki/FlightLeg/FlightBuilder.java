package com.adamglowicki.FlightLeg;

public interface FlightBuilder {

    void buildFrom();
    void buildTo();
    void buildDelayed();
    void buildPrice();

    FlightLeg getFlightLeg();
}
