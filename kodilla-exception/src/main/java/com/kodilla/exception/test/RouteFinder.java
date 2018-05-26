package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> airportAvailability = new HashMap<>();
        Flight flightDetails = flight;
        String departureAirport = flightDetails.getDepartureAirport();
        String arrivalAirport = flightDetails.getArrivalAirport();

        for (Map.Entry<String, Boolean> entry: airportAvailability.entrySet()) {
            if (entry.getKey().equals(departureAirport) || entry.getKey().equals(arrivalAirport)) {
                System.out.println("Flight is available.");
                break;
                }
            }
        throw new RouteNotFoundException("Airport not available!");
    }
}


