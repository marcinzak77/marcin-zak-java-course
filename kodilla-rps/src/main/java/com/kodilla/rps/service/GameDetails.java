package com.kodilla.rps.service;

public class GameDetails {

    private static GameDetails gameDetailsInstance = null;
    private String name;
    private int rounds;

    private GameDetails() {
        }

    public static GameDetails getInstance() {
        if (gameDetailsInstance == null) {
            synchronized (GameDetails.class) {
                if (gameDetailsInstance == null) {
                    gameDetailsInstance = new GameDetails();
                }
            }
        }
        return gameDetailsInstance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getName() {
        return name;
    }

    public int getRounds() {
        return rounds;
    }
}
