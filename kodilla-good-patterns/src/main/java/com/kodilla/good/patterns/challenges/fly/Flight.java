package com.kodilla.good.patterns.challenges.fly;

import com.kodilla.good.patterns.challenges.fly.city.City;

import java.util.Objects;

public class Flight {

    private City departure;
    private City arrival;

    public Flight(City departure, City arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public City getDeparture() {
        return departure;
    }

    public City getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departure, arrival);
    }
}
