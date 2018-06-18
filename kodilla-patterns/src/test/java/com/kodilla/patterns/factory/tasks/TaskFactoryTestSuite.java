package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        String results = drivingTask.getTaskName();
        //Then
        Assert.assertEquals("Driving Task 1", results);
    }

    @Test
    public void testTaskFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        String results = paintingTask.getTaskName();

        //Then
        Assert.assertEquals("Painting Task 1", results);
    }

    @Test
    public void testTaskFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        String results = shoppingTask.getTaskName();

        //Then
        Assert.assertEquals("Shopping Task 1", results);
    }

    @Test
    public void testExecuteTask () {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        boolean resultsBefore = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean resultsAfter = shoppingTask.isTaskExecuted();

        //Then
        Assert.assertEquals(false, resultsBefore);
        Assert.assertEquals(true, resultsAfter);
    }
}
