package com.kodilla.good.patterns.challenges.fly.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GdanskCity implements City {

    private String cityName = "Gdańsk";
    private List<String> departureAirports = new ArrayList<>(Arrays.asList("Wrocław", "Katowice", "Warszawa"));

    @Override
    public String getCityName() {
        return cityName;
    }

    @Override
    public List<String> getDepartureAirports() {
        return departureAirports;
    }
}
