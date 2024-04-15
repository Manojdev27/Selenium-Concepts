package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HandlingSelectable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/selectable/");

        driver.switchTo().frame(0);
       List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
       Integer listSize = selectable.size();
        System.out.println(listSize);
        Actions actions = new Actions(driver);
//        actions.keyDown(Keys.CONTROL)
//                        .click(selectable.get(0))
//                .click(selectable.get(1))
//                .click(selectable.get(2))
//                .click(selectable.get(3))
//                .click(selectable.get(4))
//                .click(selectable.get(5))
//                .click(selectable.get(6)).build().perform();

        actions.clickAndHold(selectable.get(0));
        actions.clickAndHold(selectable.get(1));
        actions.clickAndHold(selectable.get(2));
        actions.clickAndHold(selectable.get(3));
        actions.clickAndHold(selectable.get(4));
        actions.clickAndHold(selectable.get(5));
        actions.clickAndHold(selectable.get(6));
        actions.build().perform();

    }
}
