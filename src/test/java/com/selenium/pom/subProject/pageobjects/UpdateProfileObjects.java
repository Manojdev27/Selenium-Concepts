package com.selenium.pom.subProject.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects {

    @FindBy(xpath = "//a[contains(text(), \"Profile\")]")
    public static WebElement myProfile;

    // it is a best practice to use the FindBy annotation so use id or name as a WebElement variable name.
//    @FindBy(xpath = "\"//input[@id=\\\"Phone\\\"]\"")
    public static WebElement Phone;

    @FindBy(xpath = "//input[@name =\"password\"]")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\"profile\"]/div/div[3]/div[2]/div/div/button/div/div/div/span")
    public static WebElement country;
    @FindBy(xpath = "//*[@id=\"profile\"]/div/div[3]/div[2]/div/div/div/div[1]/input")
    public static WebElement search;

    @FindBy(xpath = "//input[@id=\"State\"]")
    public static WebElement state;

    @FindBy(xpath = "//input[@id=\"City\"]")
    public static WebElement city;

    @FindBy(xpath = "//button[@class=\"w-100 submit_button btn btn-primary btn-m rounded-sm waves-effect\"]")
    public static WebElement updateProfile;


//    public static WebElement myProfile(WebDriver driver){
//        return driver.findElement(By.xpath("//a[contains(text(), \"Profile\")]"));
//    }

//    public static WebElement phone(WebDriver driver){
//return driver.findElement(By.xpath("//input[@id=\"Phone\"]"));
//    }
//
//    public static WebElement password(WebDriver driver){
//return driver.findElement(By.xpath("//input[@name =\"password\"]"));
//    }
//    public static WebElement country(WebDriver driver){
//        return driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[3]/div[2]/div/div/button/div/div/div/span"));
//    }

//    public static WebElement search(WebDriver driver){
//        return driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[3]/div[2]/div/div/div/div[1]/input"));
//    }
//
//    public static WebElement state(WebDriver driver){
//        return driver.findElement(By.xpath("//input[@id=\"State\"]"));
//    }
//
//    public static WebElement city(WebDriver driver){
//        return driver.findElement(By.xpath("//input[@id=\"City\"]"));
//    }
//
//    public static WebElement updateProfile(WebDriver driver){
//       return driver.findElement(By.xpath("//button[@class=\"w-100 submit_button btn btn-primary btn-m rounded-sm waves-effect\"]"));
//    }
}
