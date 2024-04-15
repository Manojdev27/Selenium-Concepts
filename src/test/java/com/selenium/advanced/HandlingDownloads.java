package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HandlingDownloads {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        String oldWindow = driver.getWindowHandle();
        driver.get("https://romsunlocked.com/");
        driver.findElement(By.id("s")).sendKeys("god hand \n");

        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div[1]/a")).click();
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div[1]/div[3]/p[5]/a"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();", element1);


        Set<String> handles = driver.getWindowHandles();
        for (String newWindow: handles) {
            driver.switchTo().window(newWindow);
        }
       Thread.sleep(30000);
       WebElement element2 = driver.findElement(By.xpath("//*[@id=\"submitFree\"]"));
       JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver;
       javascriptExecutor1.executeScript("arguments[0].click();",element2);

}
}
