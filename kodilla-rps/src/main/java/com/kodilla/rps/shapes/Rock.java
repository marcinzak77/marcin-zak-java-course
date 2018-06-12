package com.kodilla.rps.shapes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
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
