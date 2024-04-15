package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WaysToSearchInGoogle {

    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Game of Thrones \n");
//        searchBox.sendKeys("Game of Thrones");
//        searchBox.sendKeys("Game of Thrones" +Keys.ENTER);
//        searchBox.sendKeys(Keys.ENTER);
//        searchBox.submit();
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
