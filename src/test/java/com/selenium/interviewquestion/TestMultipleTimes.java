package com.selenium.interviewquestion;

import org.testng.annotations.Test;

public class TestMultipleTimes {

    @Test(invocationCount = 5)
    public void test(){
        System.out.println("Invocation count");
    }
}
