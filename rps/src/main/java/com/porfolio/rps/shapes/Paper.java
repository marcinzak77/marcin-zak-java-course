package com.porfolio.rps.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paper implements Shape {

    @Override
    public List<String> canWinWith() {
        return new ArrayList<>(Arrays.asList("rock"));
    }

    @Override
    public String getName() {
        return "paper";
    }
}
