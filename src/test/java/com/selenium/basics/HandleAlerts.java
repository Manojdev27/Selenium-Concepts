package com.selenium.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/alert.xhtml");

        // Handling Simple alert
        WebElement alertBox = driver.findElement(By.xpath("//span[@class=\"ui-button-text ui-c\"]"));
        alertBox.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Handling confirm dialog
        WebElement alerts = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
        alerts.click();
        Thread.sleep(2000);
        Alert alertCancel = driver.switchTo().alert();
        alertCancel.dismiss();

        //Handling prompt alert
        WebElement promptAlerts = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
        promptAlerts.click();
        Thread.sleep(2000);
        Alert alertPrompt = driver.switchTo().alert();
        alertPrompt.sendKeys("Harry Potter");
        System.out.println(alertPrompt.getText());
        Thread.sleep(2000);
        alertPrompt.accept();
        String text =  promptAlerts.getAttribute("span");
        System.out.println(text);
    }
}
