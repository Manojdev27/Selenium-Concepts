package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RefreshBrowser {
    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Harry Potter");
        element.sendKeys(Keys.F5);
//        element.sendKeys(Keys.ENTER);
//        driver.navigate().refresh();
//        driver.get(driver.getCurrentUrl());
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("location.reload()");
//        javascriptExecutor.executeScript("history.go(0)");

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_F5);
//        robot.keyRelease(KeyEvent.VK_F5);


    }
}
