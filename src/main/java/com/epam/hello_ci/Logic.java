package com.epam.hello_ci;

public class Logic
{
    private String errorMessage = "can not return line";

    public String returnLine(String line)
    {
        return line != null ? line : errorMessage;
    }
}
