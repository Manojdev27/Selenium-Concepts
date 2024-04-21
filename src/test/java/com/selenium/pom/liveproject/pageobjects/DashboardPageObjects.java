package com.selenium.pom.liveproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjects {

    @FindBy(xpath = "(//div[@class =\"orangehrm-dashboard-widget-body\"])[1]")
    public static WebElement pendingLeaveRequest;

}
