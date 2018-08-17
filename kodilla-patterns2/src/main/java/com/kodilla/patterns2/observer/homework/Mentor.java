package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentTasks tasks) {
        System.out.println(username + ": New task to check from " + tasks.getName() + "\n" +
                " (total: " + tasks.getTasksList().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
