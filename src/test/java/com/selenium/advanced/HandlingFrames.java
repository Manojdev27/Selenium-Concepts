package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingFrames {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/frame.xhtml;jsessionid=node01ltl17k3tkijt1b5cnjcddbks5608828.node0");
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.id("Click"));
        element.click();
        String text = element.getText();
        System.out.println(text);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");
        WebElement element1 = driver.findElement(By.id("Click"));
        element1.click();
        String text2 = element1.getText();
        System.out.println(text2);

        driver.switchTo().defaultContent();
        List<WebElement> frameCount  = driver.findElements(By.tagName("iframe"));
        Integer totalFrames = frameCount.size();
        System.out.println(totalFrames);

    }
}
