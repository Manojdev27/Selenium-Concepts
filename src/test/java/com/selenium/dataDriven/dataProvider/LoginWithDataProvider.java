package com.selenium.dataDriven.dataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {

    WebDriver driver;
   String [] [] data = {
        {"manojkumardev27@gmail.com","Godhand27"},
        {"manojkumar27@gmail.com","Godhand"},
        {"manojkumar27@gmail.com","Godhand27"},
        {"manojkumardev27@gmail.com","Godhand"}
    };

    @DataProvider(name = "loginData")
    public String[][] loginDataProvider(){
          return data;
    }

    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "loginData")
    public void login(String username, String pword){

        driver.navigate().to("https://www.facebook.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        userName.sendKeys(username);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys(pword);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
@AfterTest
public void tearDown(){
          driver.quit();
    }
}
