package com.porfolio.rps;

import com.porfolio.rps.service.GameStarter;

public class RpsRunner {
    public static void main(String[] args) {

        GameStarter gameStarter = new GameStarter();
        gameStarter.startGame();

        System.out.println("done");


    }
}
