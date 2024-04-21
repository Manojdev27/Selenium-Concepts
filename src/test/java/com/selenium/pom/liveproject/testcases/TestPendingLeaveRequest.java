package com.selenium.pom.liveproject.testcases;


import com.selenium.pom.liveproject.commonfunctions.CommonFunctions;
import com.selenium.pom.liveproject.pageobjects.DashboardPageObjects;
import com.selenium.pom.liveproject.pageobjects.LoginPageObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPendingLeaveRequest extends CommonFunctions {
    String actualMessage = null;
    public void login(){
        PageFactory.initElements(driver, LoginPageObjects.class);
        LoginPageObjects.userName.sendKeys(properties.getProperty("username"));
        LoginPageObjects.password.sendKeys(properties.getProperty("password"));
        LoginPageObjects.submit.click();
    }

    public void getPendingLeaveRequest(){
        PageFactory.initElements(driver, DashboardPageObjects.class);
        actualMessage = DashboardPageObjects.pendingLeaveRequest.getText();

    }
    @Test
    public void verifyPendingLeaveRequests(){
        login();
        getPendingLeaveRequest();
        Assert.assertEquals(actualMessage,"No Pending Actions to Perform");
    }

}
