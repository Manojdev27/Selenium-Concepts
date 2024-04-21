package com.selenium.interviewQuestion;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://phptravels.net/login");
        WebElement userElement = driver.findElement(By.xpath("//input[@id='email']"));
        userElement.sendKeys("manojkumardev27@gmail.com");
        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
        passwordElement.sendKeys("Phptravels");
        WebElement submit = driver.findElement(By.xpath("//button[@id='submitBTN']"));
        submit.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver,20);
        WebElement profile = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = ' My Profile']")));
        profile.click();
        driver.quit();
    }
}
