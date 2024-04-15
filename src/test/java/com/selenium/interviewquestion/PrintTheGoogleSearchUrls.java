package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintTheGoogleSearchUrls {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Game of Thrones \n");
        Thread.sleep(5000);
        // To print all the Urls
//        List<WebElement> searchSuggestions = driver.findElements(By.xpath("//a"));
//        for(WebElement element:searchSuggestions){
//            System.out.println(element.getAttribute("href"));
//        }

        // To print the main links
        List<WebElement> mainLinks = driver.findElements(By.xpath("//*[@id =\"search\"]//following::h3//following::div/cite"));
        for (WebElement links:mainLinks){
            System.out.println(links.getText());
        }
    }
}
