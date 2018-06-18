package com.kodilla.rps;

import com.kodilla.rps.service.GameStarter;

public class RpsRunner {
    public static void main(String[] args) {

        GameStarter gameStarter = new GameStarter();
        gameStarter.startGame();

        System.out.println("done");


    }
}
