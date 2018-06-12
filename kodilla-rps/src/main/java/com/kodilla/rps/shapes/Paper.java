package com.kodilla.rps.shapes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
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
