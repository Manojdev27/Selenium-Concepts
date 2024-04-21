package com.selenium.pom.liveproject.commonfunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    public static  WebDriver driver = null;
    public static Properties properties = null;

    public Properties loadPropertyFile() throws IOException {
        FileInputStream fileInputStream= new FileInputStream("D:\\Selenium Projects\\PageObjectModel\\src\\test\\resources\\config.properties");
        properties= new Properties();
        properties.load(fileInputStream);
        return properties;
    }
    @BeforeSuite
    public void launchBrowser() throws IOException {

        loadPropertyFile();
        String browser=properties.getProperty("browser");
        String url=properties.getProperty("url");
       if(browser.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       } else if (browser.equalsIgnoreCase("firefox")) {
           WebDriverManager.firefoxdriver().setup();
           driver  = new FirefoxDriver();
       }
       driver.manage().window().maximize();
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown(){
//        driver.quit();
    }
}
