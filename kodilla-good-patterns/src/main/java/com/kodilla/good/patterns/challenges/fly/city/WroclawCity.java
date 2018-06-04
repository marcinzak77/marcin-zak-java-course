package com.kodilla.good.patterns.challenges.fly.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WroclawCity implements City {

    private String cityName = "Wrocław";

    private List<String> departureAirports = new ArrayList<>(Arrays.asList("Gdańsk", "Warszawa", "Rzeszów"));

    public String getCityName() {
        return cityName;
    }

    public List<String> getDepartureAirports() {
        return departureAirports;
    }
}
