package com.selenium.pom.liveproject.testcases;


import com.selenium.pom.liveproject.commonfunctions.CommonFunctions;
import com.selenium.pom.liveproject.pageobjects.UserRolePageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestUserRole extends CommonFunctions {

    public void moveToUsersPage(){
        PageFactory.initElements(driver, UserRolePageObjects.class);
        Actions actions = new Actions(driver);
        actions.moveToElement(UserRolePageObjects.admin);
        actions.moveToElement(UserRolePageObjects.userManagement);
        actions.moveToElement(UserRolePageObjects.users);
        actions.click().build().perform();
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("arguments[0].click();", UserRolePageObjects.admin);
//        UserRolePageObjects.userManagement.click();
//        UserRolePageObjects.users.click();
    }

    public void selectUserRole(){
//        Select selectUserRole = new Select(UserRolePageObjects.userRole);
//        selectUserRole.selectByIndex(1);
        PageFactory.initElements(driver, UserRolePageObjects.class);
        UserRolePageObjects.userRole.click();
        UserRolePageObjects.userRole.sendKeys("Admin");
    }
    public void selectStatus(){
//        Select selectStatus = new Select(UserRolePageObjects.status);
//        selectStatus.selectByIndex(1);
        PageFactory.initElements(driver, UserRolePageObjects.class);
        UserRolePageObjects.status.click();
        UserRolePageObjects.status.sendKeys("Enabled");
    }

    public void search(){
        PageFactory.initElements(driver, UserRolePageObjects.class);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();", UserRolePageObjects.search);

    }
    @Test
    public void checkUserRole(){
        PageFactory.initElements(driver, UserRolePageObjects.class);
        moveToUsersPage();
        selectUserRole();
        selectStatus();
        search();

    }
}
