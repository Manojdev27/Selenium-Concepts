package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopup {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // passing the username and password via url will use to handle authentication popups
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
