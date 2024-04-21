package com.selenium.exceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnReachableBrowserException {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Manoj Targaryen\\Downloads\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
}
