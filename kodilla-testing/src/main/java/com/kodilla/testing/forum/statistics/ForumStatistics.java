package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostCountPerUser;
    private double averageCommentsCountPerUser;
    private double averageCommentsCountPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        if (usersCount > 0) {
            averagePostCountPerUser = statistics.postsCount() / usersCount;
            averageCommentsCountPerUser = statistics.commentsCount() / usersCount;
            if (statistics.postsCount() > 0) {
                averageCommentsCountPerPost = statistics.commentsCount() / statistics.postsCount();
            }
        }
    }

    public void showStatistics() {
        System.out.println("User Count: " + usersCount);
        System.out.println("Average Post Count Per User: " + averagePostCountPerUser);
        System.out.println("Average Comments Count Per User: " + averageCommentsCountPerUser);
        System.out.println("Average Comments Count Per Post: " + averageCommentsCountPerPost);
    }

    public double getAveragePostCountPerUser() {
        return averagePostCountPerUser;
    }

    public double getAverageCommentsCountPerUser() {
        return averageCommentsCountPerUser;
    }

    public double getAverageCommentsCountPerPost() {
        return averageCommentsCountPerPost;
    }

    public int getUsersCount() {
        return usersCount;
    }
}
