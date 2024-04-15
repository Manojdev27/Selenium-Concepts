package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectAllCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node0fztc2wzaybi24imu0kbxp1fy602264.node0");
        List<WebElement> allBoxes = driver.findElements(By.xpath("//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"]"));
        for (WebElement element: allBoxes){
            element.click();
            if(element.isEnabled()){
                element.click();
            }

        }


    }
}
