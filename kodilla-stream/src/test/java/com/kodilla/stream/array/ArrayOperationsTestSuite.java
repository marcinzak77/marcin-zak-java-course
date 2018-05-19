package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(5.5, result, 1D);

    }
}
