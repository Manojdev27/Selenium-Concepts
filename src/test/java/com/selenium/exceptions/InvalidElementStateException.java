package com.selenium.exceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidElementStateException {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\HiddenField.html");
        // When the element is hidden and we perform an operation it throws InvalidElementStateException
        WebElement element = driver.findElement(By.id("textID"));
        element.sendKeys(" ");
//        element.clear();
    }
}
