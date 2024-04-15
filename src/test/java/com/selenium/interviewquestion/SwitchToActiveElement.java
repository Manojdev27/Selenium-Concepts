package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElement {
   static WebElement q;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
//      driver.switchTo().activeElement().sendKeys("Game of Thrones \n");
        PageFactory.initElements(driver, SwitchToActiveElement.class);
        q.sendKeys("Game of Thrones \n");
    }
}
