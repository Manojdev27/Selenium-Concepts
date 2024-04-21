package com.selenium.testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case is going to execute");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test case is Failed But Within Success Percentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test case is Failed With Timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test case is started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test case is finished");
    }
}
