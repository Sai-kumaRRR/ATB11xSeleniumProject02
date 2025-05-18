package com.testingacademy.Utils;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class WebDriverManager {

    public static WebDriver getDriver() {

        return new WebDriver() {
            @Override
            public void get(String url) {

            }

            @Override
            public @Nullable String getCurrentUrl() {
                return "";
            }

            @Override
            public @Nullable String getTitle() {
                return "";
            }

            @Override
            public List<WebElement> findElements(By by) {
                return List.of();
            }

            @Override
            public WebElement findElement(By by) {
                return null;
            }

            @Override
            public @Nullable String getPageSource() {
                return "";
            }

            @Override
            public void close() {

            }

            @Override
            public void quit() {

            }

            @Override
            public Set<String> getWindowHandles() {
                return Set.of();
            }

            @Override
            public String getWindowHandle() {
                return "";
            }

            @Override
            public TargetLocator switchTo() {
                return null;
            }

            @Override
            public Navigation navigate() {
                return null;
            }

            @Override
            public Options manage() {
                return null;
            }
        };


    }
}
