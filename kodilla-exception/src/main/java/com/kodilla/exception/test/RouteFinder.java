package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("Berlin", true);
        airportList.put("Barcelona", true);
        airportList.put("Praha", true);
        airportList.put("Moscow", true);
        airportList.put("Athens", false);

        Flight flightDetails = flight;
        String departureAirport = flightDetails.getDepartureAirport();
        String arrivalAirport = flightDetails.getArrivalAirport();


            if (airportList.get(departureAirport)) {
                    if (airportList.get(arrivalAirport)) {
                        System.out.println("Flight is available.");
                        return;
                    }
            }

        throw new RouteNotFoundException("Airport not available!");
    }
}


