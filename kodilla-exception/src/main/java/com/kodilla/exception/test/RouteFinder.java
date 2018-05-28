package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException{

        //Map<String, Boolean> airportAvailability = new HashMap<>();
        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("Berlin", true);
        airportList.put("Barcelona", true);
        airportList.put("Praha", true);
        airportList.put("Moscow", true);
        airportList.put("Athens", false);

        Flight flightDetails = flight;
        String departureAirport = flightDetails.getDepartureAirport();
        String arrivalAirport = flightDetails.getArrivalAirport();

        for (Map.Entry<String, Boolean> entry: airportList.entrySet()) {
            if (entry.getKey().equals(departureAirport) && entry.getValue()) {
                for (Map.Entry<String, Boolean> entry2: airportList.entrySet()) {
                    if (entry2.getKey().equals(arrivalAirport) && entry2.getValue()) {
                        System.out.println("Flight is available.");
                        return;
                    }
                }
            }
        }
        throw new RouteNotFoundException("Airport not available!");
    }
}


