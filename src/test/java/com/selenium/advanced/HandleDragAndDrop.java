package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDragAndDrop {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/drag.xhtml");

        WebElement from = driver.findElement(By.id("form:drag_content"));
        WebElement  to =driver.findElement(By.id("form:drop"));

        Actions actions = new Actions(driver);
//        actions.clickAndHold(from).moveToElement(to).release().build().perform();
        actions.dragAndDrop(from,to).build().perform();

        WebElement element = driver.findElement(By.id("form:logo"));
        actions.clickAndHold(element).release().build().perform();
    }
}
