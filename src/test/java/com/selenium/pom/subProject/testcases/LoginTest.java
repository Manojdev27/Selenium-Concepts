package com.selenium.pom.subProject.testcases;

import com.selenium.pom.subProject.pageobjects.LoginPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://phptravels.net/login");

        PageFactory.initElements(driver, LoginPageObjects.class);

        LoginPageObjects.userName.sendKeys("user@phptravels.com");
        LoginPageObjects.password.sendKeys("demouser");
        LoginPageObjects.submit.click();

//        LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
//        LoginPageObjects.password(driver).sendKeys("demouser");
//        LoginPageObjects.submit(driver).click();
    }
}
