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
            System.out.println("Hi " + GameDetails.getInstance().getName() + " This is round number: " + rounds);
            System.out.println("Your wins: " + WinCounter.getInstance().getWin() + " Your lost: " + WinCounter.getInstance().getLost());
            Movements movements = new Movements();
            option = movements.options();
            done = gameRound.GameRound(option);
            if (rounds >= GameDetails.getInstance().getRounds()) {
                done = true;
                continue;
            }
        }
    }
}
