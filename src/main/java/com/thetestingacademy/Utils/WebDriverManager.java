package com.thetestingacademy.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    public static WebDriver getDriver() {

        return new ChromeDriver();
    }


}
