package com.porfolio.rps.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scissors implements Shape {

    @Override
    public List<String> canWinWith() {
        return new ArrayList<>(Arrays.asList("paper"));
    }

    @Override
    public String getName() {
        return "scissors";
    }
}
