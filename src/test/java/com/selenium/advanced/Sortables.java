package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Sortables {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/sortable/");

        driver.switchTo().frame(0);
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id = \"sortable\"]/li"));
        WebElement fromElement = elements.get(6);
        WebElement toElement = elements.get(0);

        Actions actions = new Actions(driver);
        actions.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();

    }
}
