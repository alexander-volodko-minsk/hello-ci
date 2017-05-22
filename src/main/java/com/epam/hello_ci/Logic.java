package com.epam.hello_ci;

public class Logic
{
    public String errorMessage = "can not return line";
    public String greetingMessagePattern = "Hi, your line is '%s'";

    public String returnLine(String line)
    {
        return line != null ? line : errorMessage;
    }
    
    public String returnGreeting(String line)
    {
        return line != null ? returnLine(String.format(greetingMessagePattern, line)) : errorMessage;
    }
}
