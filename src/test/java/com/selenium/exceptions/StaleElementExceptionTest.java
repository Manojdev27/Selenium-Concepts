package com.selenium.exceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Harry Potter \n");

        // If we find the element once, and we can proceed operations for many times we can receive StaleElementReferenceException
        // If we find the element again for performing the operations. will be able to avoid this exception.
        // The above exception occurs only by having the below two causes.
        // The referenced element is not attached to the DOM anymore.
        //The referenced element has been deleted permanently.

//        searchBox.clear();
        WebElement searchBox1 = driver.findElement(By.name("q"));
        searchBox1.clear();

    }
}
