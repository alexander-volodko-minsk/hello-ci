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
    public void returnNotNullLineTest()
    {
        System.out.println("first1Test");
        String testLine = "line";
        Assert.assertEquals(testLine, logic.returnLine(testLine));
    }

    @Test
    public void returnNullLineTest()
    {
        System.out.println("second2Test");
        String errorMessage = "can not return line";
        Assert.assertEquals(errorMessage, logic.returnLine(null));
    }
}
