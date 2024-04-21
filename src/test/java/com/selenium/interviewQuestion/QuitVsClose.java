package com.selenium.interviewQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://leafground.com/window.xhtml");
        WebElement firstButton = driver.findElement(By.xpath("//span[text()= 'Open Multiple']"));
        firstButton.click();
        Thread.sleep(3000);
//        driver.close();
//        driver.quit();
    }
}
