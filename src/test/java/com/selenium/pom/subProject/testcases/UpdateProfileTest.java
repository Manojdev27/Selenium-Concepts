package com.selenium.pom.subProject.testcases;

import com.selenium.pom.subProject.pageobjects.LoginPageObjects;
import com.selenium.pom.subProject.pageobjects.UpdateProfileObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test
    public void updateProfile(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://phptravels.net/login");

        PageFactory.initElements(driver, LoginPageObjects.class);
        PageFactory.initElements(driver, UpdateProfileObjects.class);

        LoginPageObjects.userName.sendKeys("user@phptravels.com");
        LoginPageObjects.password.sendKeys("demouser");
        LoginPageObjects.submit.click();

//        LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
//        LoginPageObjects.password(driver).sendKeys("demouser");
//        LoginPageObjects.submit(driver).click();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",UpdateProfileObjects.myProfile);
        UpdateProfileObjects.city.clear();
        UpdateProfileObjects.city.sendKeys("King's Landing");
        UpdateProfileObjects.Phone.clear();
        UpdateProfileObjects.Phone.sendKeys("1234567890");
        UpdateProfileObjects.password.sendKeys("demouser");
        UpdateProfileObjects.state.clear();
        UpdateProfileObjects.state.sendKeys("Westeros");
        UpdateProfileObjects.country.click();
        UpdateProfileObjects.search.sendKeys("India "+ Keys.ENTER);
        javascriptExecutor.executeScript("arguments[0].click();",UpdateProfileObjects.updateProfile);


//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("arguments[0].click();",UpdateProfileObjects(driver).myProfile);
//        UpdateProfileObjects.city(driver).clear();
//        UpdateProfileObjects.city(driver).sendKeys("King's Landing");
//        UpdateProfileObjects.Phone(driver).clear();
//        UpdateProfileObjects.Phone(driver).sendKeys("1234567890");
//        UpdateProfileObjects.password(driver).sendKeys("demouser");
//        UpdateProfileObjects.state(driver).clear();
//        UpdateProfileObjects.state(driver).sendKeys("Westeros");
//        UpdateProfileObjects.country(driver).click();
//        UpdateProfileObjects.search(driver).sendKeys("India "+ Keys.ENTER);
//        javascriptExecutor.executeScript("arguments[0].click();",UpdateProfileObjects(driver).updateProfile);
    }
}
