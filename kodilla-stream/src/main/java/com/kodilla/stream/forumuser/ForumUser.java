package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userID;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postPublished;

    public ForumUser(int userID, String userName, char sex, LocalDate dateOfBirth, int postPublished) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postPublished = postPublished;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostPublished() {
        return postPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postPublished=" + postPublished +
                '}';
    }
}
