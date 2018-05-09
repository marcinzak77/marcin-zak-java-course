package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator myList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> emptyArrayList = new ArrayList<>();
        System.out.println("Testing" + emptyArrayList);
        //Then
        ArrayList<Integer> results = myList.exterminate(emptyArrayList);
        System.out.println("Results: " + results);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator myList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> arrayListWithNumbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            arrayListWithNumbers.add(i);
        }
        System.out.println("Testing: " + arrayListWithNumbers);
        //Then
        ArrayList<Integer> results = myList.exterminate(arrayListWithNumbers);
        System.out.println("Results: " + results);
    }
}
