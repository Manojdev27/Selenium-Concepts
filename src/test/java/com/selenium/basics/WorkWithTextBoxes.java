package com.selenium.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithTextBoxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.clear();
        name.sendKeys("Harry Potter");
        WebElement country = driver.findElement(By.id("j_idt88:j_idt91"));
        country.sendKeys("Hogwarts");
        WebElement element = driver.findElement(By.id("j_idt88:j_idt93"));
        Boolean disable = element.isEnabled();
        System.out.println(disable);
        WebElement clear = driver.findElement(By.id("j_idt88:j_idt95"));
        clear.clear();
        String retrieve = driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt97\"]"))
                .getAttribute("value");
        System.out.println(retrieve);
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("harry@hogwarts.com"+ Keys.TAB);
        driver.findElement(By.xpath("//textarea[@id = \"j_idt88:j_idt101\"]"))
                .sendKeys("Harry Potter The Chosen One !");
        driver.findElement(By.xpath("//div[@class=\"ql-editor ql-blank\"]"))
                .sendKeys("Harry Potter The Chosen One !");
        WebElement age = driver.findElement(By.id("j_idt106:thisform:age"));
        age.sendKeys(Keys.ENTER);
        String errMessage = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
        System.out.println(errMessage);
//        WebElement element1 = driver.findElement(By.id("j_idt106:float-input"));
//        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(element1));
        WebElement element1 = driver.findElement(By.id("j_idt106:auto-complete_input"));
        element1.sendKeys("manoj");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].value = 'manoj3'",element1);
        javascriptExecutor.executeScript("arguments[0].click();",element1);


    }
}
