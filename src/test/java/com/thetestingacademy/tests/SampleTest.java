package com.thetestingacademy.tests;

import com.thetestingacademy.Base.BaseTest;
import com.thetestingacademy.Constants.Constants;
import com.thetestingacademy.PageObjects.GoogleHomePage;
import com.thetestingacademy.listners.RetryAnalyner;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    private GoogleHomePage googleHomePage;

    @Test(description =  "Test to verify Google Search functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Google Search")
    @Story("As a user, i want to search for a term using google")
    @Description("Test Description: Verify that the user can search for a term using google")
    public void testGoogleSearch() {
        driver.get(Constants.BASE_URL);
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchFor("TheTestingAcademy");
        Assert.assertEquals(driver.getTitle(), "TheTestingAcademy - Google Search");
    }

    @Test(description = "Test to verify google search functionality2" )
    public void testGoogleSearchNegative() {
        driver.get(Constants.BASE_URL);
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchFor("TheTestingAcademy");
        Assert.assertEquals(driver.getTitle(), "No Title");
    }
}