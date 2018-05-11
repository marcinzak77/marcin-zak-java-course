package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

//Test suite for classes of ShapeCollector
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle(5);

        //When
        shape.addFigure(circle);

        //Then
        Assert.assertEquals(1, shape.getAllFigures().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle(5);
        shape.addFigure(circle);

        //When
        shape.removeFigure(circle);

        //Then
        Assert.assertEquals(0, shape.getAllFigures().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle(5);
        shape.addFigure(circle);

        //When
        String result = shape.getFigure(0);

        //Then
        Assert.assertEquals("circle", result);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        ArrayList<String> shapeList = new ArrayList<>();
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5,5);
        shapeList.add("circle");
        shapeList.add("triangle");

        //When
        shape.addFigure(circle);
        shape.addFigure(triangle);
        ArrayList<String> results = shape.showFigures();

        //Then
        Assert.assertEquals(shapeList, results);
    }
}
