package com.kodilla.good.patterns.challenges.fly.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KatowiceCity implements City{

    private String cityName = "Katowice";
    private List<String> departureAirports = new ArrayList<>(Arrays.asList("Gdańsk", "Warszawa", "Rzeszów"));

    public String getCityName() {
        return cityName;
    }

    public List<String> getDepartureAirports() {
        return departureAirports;
    }
}
