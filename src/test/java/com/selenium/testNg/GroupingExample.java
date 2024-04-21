package com.selenium.testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupingExample {

    WebDriver driver;
    @BeforeSuite(groups = {"sites"})
    public void openBrowsers(){
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(groups = {"sites"})
    public void openInstagram(){

        driver.navigate().to("https://www.google.com/");
    }
    @Test
    public void openTwitter(){
        driver.get("https://twitter.com/i/flow/login");
    }
    @Test(groups = {"sites"})
    public void openYoutube(){
        driver.get("https://www.youtube.com/");
    }
    @AfterSuite(groups = {"sites"})
    public void tearDownBrowser(){
        driver.quit();
    }
}
