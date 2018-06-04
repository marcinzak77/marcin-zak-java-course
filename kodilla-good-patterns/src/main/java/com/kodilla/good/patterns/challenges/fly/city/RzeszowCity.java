package com.kodilla.good.patterns.challenges.fly.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RzeszowCity implements City {

    private String cityName = "Rzeszow";
    private List<String> departureAirports = new ArrayList<>(Arrays.asList("Warszawa", "Katowice", "Wrocłąw"));

    public String getCityName() {
        return cityName;
    }

    public List<String> getDepartureAirports() {
        return departureAirports;
    }
}
