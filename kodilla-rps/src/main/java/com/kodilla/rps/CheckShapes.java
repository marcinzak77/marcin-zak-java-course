package com.kodilla.rps;

public class CheckShapes {

    public String whoIsWinner(final Shapes shapeOne, final Shapes shapeTwo) {

        IsShapeOnTheList isShapeOneOnTheList = new IsShapeOnTheList(shapeOne.isGoodAgainst(), shapeTwo.getName());

        if (isShapeOneOnTheList.checkShapesList()) {
            return shapeOne.getName();
        }

        IsShapeOnTheList isShapeTwoOnTheList = new IsShapeOnTheList(shapeTwo.isGoodAgainst(), shapeOne.getName());

        if(isShapeTwoOnTheList.checkShapesList()) {
            return shapeTwo.getName();
        } else {
            return "Draw";
        }
    }
}
