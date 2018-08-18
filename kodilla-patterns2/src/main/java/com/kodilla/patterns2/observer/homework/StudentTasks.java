package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements Observable {
    private final List<Observer> observers;
    private final List<String> tasksList;
    private final String name;

    public StudentTasks(String name) {
        observers = new ArrayList<>();
        tasksList = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasksList.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getTasksList() {
        return tasksList;
    }

    public String getName() {
        return name;
    }
}
