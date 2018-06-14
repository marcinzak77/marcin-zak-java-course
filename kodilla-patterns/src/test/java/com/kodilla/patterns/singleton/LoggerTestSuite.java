package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Message 1");
        Logger.getInstance().log("Message 2");
        String results = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Message 2", results);
    }
}
