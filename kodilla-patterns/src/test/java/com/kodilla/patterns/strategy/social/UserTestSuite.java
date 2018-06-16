package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike");
        User john = new ZGeneration("John");
        User anna = new YGeneration("Anna");

        //When
        String mikeSharePost = mike.sharePost("This is my day!");
        System.out.println("Mike published post: " + mikeSharePost);
        String johnSharePost = john.sharePost("I need a coffe!");
        System.out.println("John published post: " + johnSharePost);
        String annaSharePost = anna.sharePost("Hi all!");
        System.out.println("Anna published post: " + annaSharePost);

        //Then
        Assert.assertEquals("facebook: This is my day!", mikeSharePost);
        Assert.assertEquals("snapchat: I need a coffe!", johnSharePost);
        Assert.assertEquals("twitter: Hi all!", annaSharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike");

        //When
        String mikeSharePost = mike.sharePost("This is my day!");
        System.out.println("Mike published post: " + mikeSharePost);
        mike.setPrefferedNetwork(new TwitterPublisher());
        mikeSharePost = mike.sharePost("This is my day!");
        System.out.println("Mike change network and published post: " + mikeSharePost);

        //Then
        Assert.assertEquals("twitter: This is my day!", mikeSharePost);
    }
}
