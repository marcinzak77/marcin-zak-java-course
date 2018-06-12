package com.kodilla.rps.service;

import com.kodilla.rps.shapes.Shape;

public class CheckShapes {

    public String checkShapes(Shape shapeOne, Shape shapeTwo) {

      if (shapeOne.canWinWith().contains(shapeTwo.getName())) {
          return shapeOne.getName();
      } else if (shapeTwo.canWinWith().contains(shapeOne.getName())) {
          return shapeTwo.getName();
      }
        return "Draw!";
    }
}
