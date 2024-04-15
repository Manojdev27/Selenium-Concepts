package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingToolTip {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");

        WebElement toolTip = driver.findElement(By.className("bslink"));
        String toolTipText = toolTip.getAttribute("data-original-title");
        System.out.println(toolTipText);
    }
}
