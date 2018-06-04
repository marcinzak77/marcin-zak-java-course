package com.kodilla.good.patterns.challenges.fly.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarszawaCity implements City {

    String cityName = "Warszawa";
    List<String> departureAirports = new ArrayList<>(Arrays.asList("Wrocław" , "Gdańsk" , "Katowice" , "Rzeszów"));

    public String getCityName() {
        return cityName;
    }

    public List<String> getDepartureAirports() {
        return departureAirports;
    }
}
