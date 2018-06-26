package com.kodilla.rps.service;

import com.kodilla.rps.shapes.Shape;

public class CheckShapes {

    public String checkShapes(Shape shapeOne, Shape shapeTwo) {

      if (shapeOne.canWinWith().contains(shapeTwo.getName())) {
          WinCounter.getInstance().addWin();
          return shapeOne.getName();
      } else if (shapeTwo.canWinWith().contains(shapeOne.getName())) {
          WinCounter.getInstance().addLost();
          return shapeTwo.getName();
      }
        return "Draw!";
    }
}
