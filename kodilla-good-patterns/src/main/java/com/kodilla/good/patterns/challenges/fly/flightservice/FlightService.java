package com.kodilla.good.patterns.challenges.fly.flightservice;

import com.kodilla.good.patterns.challenges.fly.Flight;

public class FlightService {

    public void flightAvailability(Flight flight) {
        String departure = flight.getDeparture().getCityName();
        String arrival = flight.getArrival().getCityName();
        if (departure.equals(arrival)) {
            System.out.println("You can't fly to this same city!");
        }
        boolean directFlightFound = flight.getDeparture().getDepartureAirports().stream()
                .anyMatch(s -> s.equals(arrival));

        if (directFlightFound) {
            System.out.println("Flight from: " + departure + " to: " + arrival + " is available.");
        } else {
            System.out.println("Direct flight from: " + departure + " to " + arrival + " not found!");
            IndirectFlightService indirectFlightService = new IndirectFlightService();
            indirectFlightService.indirectFlightAvailable(flight);
        }
        }
}
