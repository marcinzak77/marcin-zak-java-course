package com.kodilla.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsPostCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = Arrays.asList("Johny", "Mike", "Anna", "Hela", "Juka", "Cety", "Just", "Fand", "Ouyd", "Loki");

        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getAveragePostCountPerUser(), 0D);
    }

    @Test
    public void testCalculateAdvStatisticsPostCount1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = Arrays.asList("Johny", "Mike", "Anna", "Hela", "Juka", "Cety", "Just", "Fand", "Ouyd", "Loki");

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getAveragePostCountPerUser(), 0D);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = Arrays.asList("Johny", "Mike", "Anna", "Hela", "Juka", "Cety", "Just", "Fand", "Ouyd", "Loki");

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getAverageCommentsCountPerUser(), 0D);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = Arrays.asList("Johny", "Mike", "Anna", "Hela", "Juka", "Cety", "Just", "Fand", "Ouyd", "Loki");

        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.1, forumStatistics.getAverageCommentsCountPerPost(), 1D);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = Arrays.asList("Johny", "Mike", "Anna", "Hela", "Juka", "Cety", "Just", "Fand", "Ouyd", "Loki");

        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getAverageCommentsCountPerPost(), 0D);
    }

    @Test
    public void testCalculateAdvStatisticsAmounfOfUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();

        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
       assertEquals(0, forumStatistics.getUsersCount(), 0D);
    }

    @Test
    public void testCalculateAdvStatisticsAmounfOfUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            userNames.add("User " + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, forumStatistics.getAverageCommentsCountPerUser(), 0D);
        assertEquals(1,forumStatistics.getAveragePostCountPerUser(), 0D);
    }

    @Test
    public void testShowStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            userNames.add("User " + i);
        }

        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        forumStatistics.showStatistics();
    }
}