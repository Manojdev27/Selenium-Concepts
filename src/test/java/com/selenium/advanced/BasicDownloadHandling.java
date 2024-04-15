package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BasicDownloadHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/file.xhtml");
        WebElement download = driver.findElement(By.id("j_idt93:j_idt95"));
        download.click();
        Thread.sleep(3000);

        File file = new File("C:\\Users\\Manoj Targaryen\\Downloads");
        File[] totalList = file.listFiles();
        for (File fileName: totalList){
            if(fileName.getName().equals("TestLeaf Logo.png")){
                System.out.println("File is downloaded");
                break;
            }
        }

    }
}
