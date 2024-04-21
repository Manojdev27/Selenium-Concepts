package com.selenium.pom.liveproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRolePageObjects {
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    public static WebElement admin;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span/i")
    public static WebElement userManagement;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li/a")
    public static WebElement users;
    @FindBy(xpath = "(//div[@class= \"oxd-select-text-input\"])[1]")
    public static WebElement userRole;
    @FindBy(xpath = "(//div[@class= \"oxd-select-text-input\"])[2]")
    public static WebElement status;
    @FindBy(xpath = "(//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]")
    public static WebElement search;

}
