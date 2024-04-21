package com.selenium.pom.subProject.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects{

    //username, password, submit button login page objects

    @FindBy(how = How.XPATH,using = "//input[@id='email']")
    public static WebElement userName;
    @FindBy(how = How.XPATH,using = "//input[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//button[@id='submitBTN']")
    public static WebElement submit;

//    public static WebElement userName(WebDriver driver){
//        return driver.findElement(By.xpath("//input[@id='email']"));
//
//    }
//
//    public static WebElement password(WebDriver driver){
//        return driver.findElement(By.xpath("//input[@id='password']"));
//    }
//
//    public static WebElement submit(WebDriver driver){
//        return driver.findElement(By.xpath("//button[@id='submitBTN']"));
//    }

}
