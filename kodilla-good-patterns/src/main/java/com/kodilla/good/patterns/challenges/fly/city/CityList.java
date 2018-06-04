package com.kodilla.good.patterns.challenges.fly.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityList {

    private final List<City> theList = new ArrayList<>(Arrays.asList(new GdanskCity(), new KatowiceCity(), new WroclawCity(), new WarszawaCity(), new RzeszowCity()));

    public List<City> getTheList() {
        return theList;
    }
}
