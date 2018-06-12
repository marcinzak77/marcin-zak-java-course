package com.kodilla.rps.service;

public class GameDetails {

    private static String name;
    private static int rounds;

    public GameDetails(String name, int rounds) {
        this.name = name;
        this.rounds = rounds;
    }

    public static String getName() {
        return name;
    }

    public static int getRounds() {
        return rounds;
    }
}
