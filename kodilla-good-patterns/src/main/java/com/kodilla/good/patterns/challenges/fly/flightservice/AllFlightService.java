package com.kodilla.good.patterns.challenges.fly.flightservice;

import com.kodilla.good.patterns.challenges.fly.city.City;
import com.kodilla.good.patterns.challenges.fly.city.CityList;

import java.util.ArrayList;
import java.util.List;

public class AllFlightService {

    public List<String> allFlightList(String cityName) {
        CityList cityList = new CityList();

        List<City> allCities = cityList.getTheList();
        ArrayList<String> theList = new ArrayList<>();
        allCities.stream()
                .filter(s -> s.getDepartureAirports().contains(cityName))
                .forEach(s -> theList.add(s.getCityName()));

        return theList;
    }
}
