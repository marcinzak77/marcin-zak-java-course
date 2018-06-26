package com.kodilla.rps.service;

public class WinCounter {
    private static WinCounter winCounterInstance = null;
    private int win;
    private int lost;

    private WinCounter() {

    }

    public static WinCounter getInstance() {
        if (winCounterInstance == null) {
            synchronized (WinCounter.class) {
                if(winCounterInstance == null) {
                   winCounterInstance = new WinCounter();
                }
            }
        }
        return winCounterInstance;
    }

    public void addWin() {
        win++;
    }

    public void addLost() {
        lost++;
    }

    public int getWin() {
        return win;
    }

    public int getLost() {
        return lost;
    }
}
