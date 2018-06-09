package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculationsAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double results = calculator.add(5,5);

        //Then
        Assert.assertEquals(10.0, results, 1d);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double results = calculator.sub(5,5);

        //Then
        Assert.assertEquals(0.0, results, 1d);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double results = calculator.div(5,5);

        //Then
        Assert.assertEquals(0.0, results, 1d);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double results = calculator.mul(5,5);

        //Then
        Assert.assertEquals(25.0, results, 1d);
    }
}
