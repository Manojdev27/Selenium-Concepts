package com.selenium.interviewquestion;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

    int failedCount = 0;
    int limit = 4;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(failedCount<limit){
        failedCount++;
        return true;
        }
        return false;

    }
}
