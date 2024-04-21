package com.selenium.interviewQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ScrollExamples {

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://echoecho.com/htmlforms11.htm");

        //scroll to some position
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("window.scroll(0,750)","");
//        Thread.sleep(3000);
//        javascriptExecutor.executeScript("window.scroll(0,-750)","");
//        Thread.sleep(3000);
//        driver.quit();

        // Go to bottom of the page
//        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
//        Thread.sleep(3000);
//        javascriptExecutor.executeScript("window.scroll(0,0)", "");

        //Go to a specific element
//        WebElement link = driver.findElement(By.linkText("online tool"));
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", link);

        // Using Robot class scroll down and up on the page
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);



    }
}
