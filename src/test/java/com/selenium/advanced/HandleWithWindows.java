package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleWithWindows {
   static WebDriver driver;
    public void countNumberOfWindows(){
        // Count number of windows open
        String oldWindow = driver.getWindowHandle();
        WebElement count = driver.findElement(By.id("j_idt88:j_idt91"));
        count.click();

        int numberOfWindows = driver.getWindowHandles().size();
        System.out.println("No of Windows opened:" +numberOfWindows);
        driver.quit();
    }
    public void handleWindow(){
        String oldWindow = driver.getWindowHandle();
        WebElement element = driver.findElement(By.id("j_idt88:new"));
        element.click();
        Set<String> handles = driver.getWindowHandles();
        for (String newWindows:handles){
            driver.switchTo().window(newWindows);

        }

        WebElement element1 = driver.findElement
                (By.xpath("//textarea[@id = \"message\"]"));
        element1.sendKeys("Harry Potter The chosen One");

        driver.quit();
    }
    public void closeWindows(){
        String oldWindow = driver.getWindowHandle();
        WebElement closeWindow = driver.findElement(By.id("j_idt88:j_idt93"));
        closeWindow.click();
        Set<String> newWindowHandles = driver.getWindowHandles();
        for (String allWindows:newWindowHandles){
            if(!allWindows.equals(oldWindow)){
                driver.switchTo().window(allWindows);
                driver.close();
            }
        }
    }
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/window.xhtml");

        HandleWithWindows handleWithWindows = new HandleWithWindows();
//        handleWithWindows.countNumberOfWindows();
//        handleWithWindows.handleWindow();
        handleWithWindows.closeWindows();
        
    }
}
