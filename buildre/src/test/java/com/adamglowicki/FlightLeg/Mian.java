package com.adamglowicki.FlightLeg;

public class Mian {
    public static void main(String[] args) {
        NewYorkFlightBuilder newYorkFlightBuilder = new NewYorkFlightBuilder();
        FlightDirector flightDirector = new FlightDirector(newYorkFlightBuilder);
        flightDirector.flightBuilder();
        FlightLeg flightFeg = flightDirector.getFlightFeg();

        System.out.println(flightFeg);


    }
}
