package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HyperLinksTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://leafground.com/link.xhtml");

        WebElement dashboard = driver.findElement(By.linkText("Go to Dashboard"));
        dashboard.click();
        driver.navigate().back();

        WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL"));
        String where =  whereToGo.getAttribute("href");
        System.out.println("This link is going to " +where);

        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();

        String title = driver.getTitle();
        if(title.contains("Error 404")){
            System.out.println("This link is broken");
        }
        else{
            System.out.println("This is working fine");
        }
        driver.navigate().back();

        WebElement dashboard2 = driver.findElement(By.linkText("Go to Dashboard"));
        dashboard2.click();

        driver.navigate().back();

        List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
        Integer linkCount = totalLinks.size();
        System.out.println(linkCount);

//        List<WebElement> layoutLinks = driver.findElements(By.tagName("link"));
//        Integer layoutLinkCount = layoutLinks.size();
//        System.out.println(layoutLinkCount);

    }
}
