package com.selenium.pom.liveproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

    @FindBy(xpath = "//input[@name= \"username\"]")
    public static WebElement userName;
    @FindBy(xpath = "//input[@name= \"password\"]")
    public static WebElement password;
    @FindBy(xpath = "//button[@class= \"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
    public static WebElement submit;
}
