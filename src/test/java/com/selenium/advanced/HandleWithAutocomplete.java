package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

public class HandleWithAutocomplete {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/autocomplete/");

        driver.switchTo().frame(0);
        WebElement autoComp =driver.findElement(By.id("tags"));
        autoComp.sendKeys("P");
        Thread.sleep(4000);

        List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
        System.out.println(optionsList.size());

        for (WebElement webElement:optionsList) {
            if (webElement.getText().equals("JavaScript")) {
                webElement.click();
               String text =  webElement.getText();
                System.out.println(STR."Selecting \{text}");
                break;
            }
        }

    }
}
