package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAddDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        List<String> taskList = new ArrayList<>(Arrays.asList("Task 1"));

        //When
        board.getDoneList().getTasks().add("Task 1");
        List<String> results = board.getDoneList().getTasks();

        //Then
        Assert.assertEquals(taskList, results);
    }

    @Test
    public void testTaskAddInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        List<String> taskList = new ArrayList<>(Arrays.asList("Task 2"));

        //When
        board.getInProgressList().getTasks().add("Task 2");
        List<String> results = board.getInProgressList().getTasks();

        //Then
        Assert.assertEquals(taskList, results);
    }

    @Test
    public void testTaskAddToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        List<String> taskList = new ArrayList<>(Arrays.asList("Task 3"));

        //When
        board.getToDoList().getTasks().add("Task 3");
        List<String> results = board.getToDoList().getTasks();

        //Then
        Assert.assertEquals(taskList, results);
    }
}
