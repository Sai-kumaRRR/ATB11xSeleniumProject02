package com.thetestingacademy.Base;

import com.thetestingacademy.Utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public  WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = WebDriverManager.getDriver();

    }

    @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
