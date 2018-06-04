package com.kodilla.good.patterns.challenges.fly.flightservice;

import com.kodilla.good.patterns.challenges.fly.Flight;

import java.util.List;

public class IndirectFlightService {

    public void indirectFlightAvailable(Flight flight) {
        String departure = flight.getDeparture().getCityName();
        String arrival = flight.getArrival().getCityName();

        AllFlightService allFlightService = new AllFlightService();
        List<String> alternativeRouteList = allFlightService.allFlightList(arrival);

        if (!alternativeRouteList.isEmpty()) {
            System.out.println("Alternative route from " + departure + " to: " + arrival + " found by:");
            System.out.println(alternativeRouteList);
        }
    }
}
