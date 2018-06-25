package com.kodilla.rps.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movements {

    private String option;
    private List<String> optionList = new ArrayList<>(Arrays.asList("1", "2", "3", "x", "n"));

    public String options() {
        System.out.println("Options: ");
        System.out.println("[1] Rock");
        System.out.println("[2] Paper");
        System.out.println("[3] Scissors");
        System.out.println("[x] End of Game");
        System.out.println("[n] New Game");

        while (!optionList.contains(option)) {
            option = KeyboardReader.getReadString().toLowerCase();
        }

        if (option.equals("1")) {
            return "ROCK";
        } else if (option.equals("2")) {
            return "PAPER";
        } else if (option.equals("3")) {
            return "SCISSORS";
        }

        return option;
    }
}
