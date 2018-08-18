package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTasks edwardNigmaStudentTasks = new EdwardNigmaStudentTasks();
        StudentTasks johnSmithStudentTasks = new JohnSmithStudentTasks();
        StudentTasks oswaldCappelpotStudentTasks = new OswaldCappelpotStudentTasks();
        Mentor evanGelya = new Mentor("Evan Gelya");
        Mentor carolLuna = new Mentor("Carol Luna");
        edwardNigmaStudentTasks.registerObserver(evanGelya);
        johnSmithStudentTasks.registerObserver(carolLuna);
        oswaldCappelpotStudentTasks.registerObserver(carolLuna);

        //When
        edwardNigmaStudentTasks.addTask("Task 1");
        edwardNigmaStudentTasks.addTask("Task 2");
        johnSmithStudentTasks.addTask("Task 1");
        oswaldCappelpotStudentTasks.addTask("Task 1");
        oswaldCappelpotStudentTasks.addTask("Task 2");
        //Then
        assertEquals(2, evanGelya.getUpdateCount());
        assertEquals(3, carolLuna.getUpdateCount());
    }
}
