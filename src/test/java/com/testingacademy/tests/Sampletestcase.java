package com.testingacademy.tests;

import com.testingacademy.Base.BaseTest;
import com.testingacademy.Constants.Constants;
import com.testingacademy.PageObjects.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sampletestcase extends BaseTest {
    private GoogleHomePage googleHomePage;


    @Test
    public void testGoogleSearch() {
        driver.get(Constants.BASE_URL);
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchFor("testingacademy");
        Assert.assertEquals(driver.getTitle(), "testingacademy - Google Search");
    }

    @Test
    public void testGoogleSearchNegative() {
        driver.get(Constants.BASE_URL);
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.searchFor("testingacademy");
        Assert.assertEquals(driver.getTitle(), "testingacademy - no title");
    }
}