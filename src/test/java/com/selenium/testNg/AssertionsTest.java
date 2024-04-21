package com.selenium.testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {
    WebDriver driver;
    String expected = "Facebook – log in or sign up";
    boolean value = false;
    @Test
    public void checkEqual(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        String actual = driver.getTitle();
        Assert.assertEquals(expected,actual);
//        Assert.assertNotEquals(expected,actual);
//        Assert.assertTrue(value, "This should not be true");
    }
}
