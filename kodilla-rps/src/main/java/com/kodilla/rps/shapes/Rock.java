package com.kodilla.rps.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rock implements Shape {

    @Override
    public List<String> canWinWith() {
        return new ArrayList<>(Arrays.asList("scissors"));
    }

    @Override
    public String getName() {
        return "rock";
    }
}
