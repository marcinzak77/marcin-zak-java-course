package com.kodilla.good.patterns.challenges.fly;

import com.kodilla.good.patterns.challenges.fly.city.*;
import com.kodilla.good.patterns.challenges.fly.flightservice.AllFlightService;
import com.kodilla.good.patterns.challenges.fly.flightservice.FlightService;

public class FlightServiceRunner {

    public static void main(String[] args) {

        Flight flightOne = new Flight(new WarszawaCity(), new WroclawCity());
        Flight flightTwo = new Flight(new RzeszowCity(), new WroclawCity());
        Flight flightThree = new Flight(new KatowiceCity(), new GdanskCity());
        Flight flightFour = new Flight(new GdanskCity(), new KatowiceCity());

        FlightService flightService = new FlightService();

        flightService.flightAvailability(flightOne);
        flightService.flightAvailability(flightTwo);
        flightService.flightAvailability(flightThree);
        flightService.flightAvailability(flightFour);

        AllFlightService allFlightService = new AllFlightService();

        System.out.println("All flights to Wrocław are available from:");
        System.out.println(allFlightService.allFlightList("Wrocław"));
    }
}
