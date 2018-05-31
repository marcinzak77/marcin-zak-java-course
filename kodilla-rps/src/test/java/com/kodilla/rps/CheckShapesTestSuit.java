package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class CheckShapesTestSuit {

    @Test
    public void testCheckShapes() {
        // Given
        Shapes shapeOne = new Rock();
        Shapes shapeTwo = new Paper();
        CheckShapes checkShapes = new CheckShapes();

        // When
        String results = checkShapes.whoIsWinner(shapeOne, shapeTwo);

        // Then
        Assert.assertEquals("Paper", results);
    }

    @Test
    public void testCheckShapesCaseTwo() {
        // Given
        Shapes shapeOne = new Paper();
        Shapes shapeTwo = new Scissors();
        CheckShapes checkShapes = new CheckShapes();

        // When
        String results = checkShapes.whoIsWinner(shapeOne, shapeTwo);

        // Then
        Assert.assertEquals("Scissors", results);

    }

    @Test
    public void testCheckShapesCaseThree() {
        // Given
        Shapes shapeOne = new Rock();
        Shapes shapeTwo = new Rock();
        CheckShapes checkShapes = new CheckShapes();

        // When
        String results = checkShapes.whoIsWinner(shapeOne, shapeTwo);

        // Then
        Assert.assertEquals("Draw", results);

    }
}
