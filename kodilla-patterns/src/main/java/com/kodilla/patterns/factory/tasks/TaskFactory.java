package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving Task 1", "Destination 1", "car 1");
            case PAINTING:
                return new PaintingTask("Painting Task 1", "color 1", "object 1");
            case SHOPPING:
                return new ShoppingTask("Shopping Task 1", "Item 1", 1.0);
            default:
                return null;
        }
    }
}
