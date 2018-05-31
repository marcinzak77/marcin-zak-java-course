package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;

public class Scissors implements Shapes{

    private String name = "Scissors";

    public List<String> isGoodAgainst() {
        List<String> theList = Arrays.asList("Paper");
        return theList;
    }

    public String getName() {
        return name;
    }
}
