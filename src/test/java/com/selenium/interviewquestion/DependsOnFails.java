package com.selenium.interviewquestion;

import org.testng.annotations.Test;

public class DependsOnFails {

    @Test(timeOut = 2000)
    public void test() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("run");
    }

    @Test(dependsOnMethods = "test" , alwaysRun = true)
    public void test2(){
        System.out.println("run again");
    }
}
