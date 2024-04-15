package com.selenium.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/radio.xhtml");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[2]/div/div[2]/span"));
        element.click();


    }
}
