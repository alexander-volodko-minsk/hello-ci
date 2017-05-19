package com.epam.hello_ci;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogicTest
{
    private Logic logic;

    @BeforeMethod(alwaysRun = true)
    public void injectDoubles()
    {
        logic = new Logic();
    }

    @Test
    public void returnnNotNullLineTest()
    {
        String testLine = "line";
        Assert.assertEquals(testLine, logic.returnLine(testLine));
    }

    @Test
    public void returnNullLineTest()
    {
        String errorMessage = "can not return line";
        Assert.assertEquals(errorMessage, logic.returnLine(null));
    }
}
