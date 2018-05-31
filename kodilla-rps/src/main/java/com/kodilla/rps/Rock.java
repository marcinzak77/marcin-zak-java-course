package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;

public class Rock implements Shapes{

    private String name = "Rock";

    public List<String> isGoodAgainst() {
        List<String> theList = Arrays.asList("Scissors");
        return theList;
    }

    public String getName() {
        return name;
    }
}
