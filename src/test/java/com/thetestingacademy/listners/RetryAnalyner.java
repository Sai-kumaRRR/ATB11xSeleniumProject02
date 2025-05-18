package com.thetestingacademy.listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyner implements IRetryAnalyzer {

    private int retryCount = 0;
    private final int maxRetryCount = 3;
    // Number of retry attempts

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
