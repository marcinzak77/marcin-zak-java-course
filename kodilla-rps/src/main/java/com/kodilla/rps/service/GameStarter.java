package com.kodilla.rps.service;

public class GameStarter {

    private boolean done = false;
    private String option;
    int rounds = 0;

    public void startGame() {

        new CreateGameDetails();
        GameRound gameRound = new GameRound();

        while (!done) {
            rounds++;
            System.out.println("Hi " + GameDetails.getName() + "This is round number: " + rounds);
            Movements movements = new Movements();
            option = movements.options();
            done = gameRound.GameRound(option);
            if (rounds >= GameDetails.getRounds()) {
                done = true;
                continue;
            }
        }
    }
}
