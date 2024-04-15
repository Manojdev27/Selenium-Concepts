package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendars {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(0);
        WebElement calendar = driver.findElement(By.id("datepicker"));
        calendar.click();
//      calendar.sendKeys("01/05/2024"+ Keys.ENTER);

        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
        nextButton.click();

        WebElement date = driver.findElement(By.xpath("//a[contains(text(),\"10\")]"));
        date.click();
    }
}
