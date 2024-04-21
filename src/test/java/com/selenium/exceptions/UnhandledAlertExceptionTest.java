package com.selenium.exceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertExceptionTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://leafground.com/alert.xhtml;jsessionid=node014h1jyzx1l26k10h2rqqtwdj3u645547.node0");
        driver.findElement(By.id("j_idt88:j_idt91")).click();
        //org.openqa.selenium.UnhandledAlertException - when we receive an alert we cannot handle the alert an proceed for other
        //operation will receive the above exception.
//         driver.findElement(By.id("j_idt88:j_idt93")).click();
    }
}
