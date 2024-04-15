package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.google.co.in"); // DOM appear wait
        driver.navigate().to("https://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("Harry Potter" +Keys.ENTER);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
