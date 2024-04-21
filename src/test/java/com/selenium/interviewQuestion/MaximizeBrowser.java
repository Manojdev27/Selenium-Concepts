package com.selenium.interviewQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//        Dimension dimension = new Dimension(1920,1080);
//        driver.manage().window().setSize(dimension);
        driver.get("https://www.google.co.in");

//        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\chromedriver.exe");

    }
}
