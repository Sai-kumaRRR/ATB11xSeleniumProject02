package com.testingacademy.Base;

import com.testingacademy.Utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
protected WebDriver driver;

@BeforeClass
    public void setup() {
        driver = WebDriverManager.getDriver();

    }
    @AfterClass
    public void tearDown() {
        if(driver != null)
            driver.quit();
    }
}
