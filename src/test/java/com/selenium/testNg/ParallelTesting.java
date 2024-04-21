package com.selenium.testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTesting {

    WebDriver driver;
    @BeforeSuite
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openGoogle(){
        driver.navigate().to("https://www.google.com/");
    }
    @Test
    public void openFacebook(){
        driver.navigate().to("https://www.facebook.com/");
    }
    @Test
    public void openAmazon(){
        driver.navigate().to("https://www.amazon.in/");
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
