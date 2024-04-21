package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonXpathTests{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id= \"twotabsearchtextbox\"]")).sendKeys("Playstation5 \n");
        driver.findElement(By.xpath("//span[@class=\"a-dropdown-label\"]")).click();
//        driver.findElement(By.xpath("//div[@class=\"a-popover-inner\"]")).sendKeys("Price: Low to High");

        // Handling dropdowns without using select class
        WebElement dropDown = driver.findElement(By.xpath("//ul[@class = \"a-nostyle a-list-link\"]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[2].click();", dropDown);



    }
}
