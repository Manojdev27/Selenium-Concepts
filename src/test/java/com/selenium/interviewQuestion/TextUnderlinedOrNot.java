package com.selenium.interviewQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedOrNot {

    //a[contains(text(),"தமிழ்")]

    public static void main(String[] args) {

        // how to get the CSS properties - using getCssValue.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),\"தமிழ்\")]"));
        String beforeHovering = element.getCssValue("text-decoration");
        System.out.println("beforeHovering = " + beforeHovering);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        String afterHovering = element.getCssValue("text-decoration");
        System.out.println("afterHovering = " + afterHovering);
        driver.quit();
    }
}
