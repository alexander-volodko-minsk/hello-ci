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
        System.out.println("lineTest1");
        String testLine = "line";
        Assert.assertEquals(testLine, logic.returnLine(testLine));
    }

    @Test
    public void returnNullLineTest()
    {
        System.out.println("lineTest2");
        Assert.assertEquals(logic.errorMessage, logic.returnLine(null));
    }
    
    @Test
    public void returnNotNullGreetingTest()
    {
        System.out.println("greetingTest1");
        String testLine = String.format(logic.greetingMessagePattern, "line");
        Assert.assertEquals(testLine, logic.returnGreeting("line"));
    }

    @Test
    public void returnNullGreetingTest()
    {
        System.out.println("greetingTest2");
        Assert.assertEquals(logic.errorMessage, logic.returnLine(null));
    }
}
