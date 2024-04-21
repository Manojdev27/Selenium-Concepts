package com.selenium.dataDriven.loginTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BothCorrect {

        @Test
        @Parameters({"username", "password"})
        public void checkLogin(String username, String pword){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        userName.sendKeys(username);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys(pword);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
}
