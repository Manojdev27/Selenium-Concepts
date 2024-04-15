package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotTest {

    public static void main(String[] args) throws IOException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://leafground.com/alert.xhtml;jsessionid=node0zt9fm6yxrotgmyc7baj9f73e600966.node0");

        WebElement element = driver.findElement(By.xpath("//button[@id = \"j_idt88:j_idt91\"]"));
        element.click();
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        File destinationFile = new File("D:\\Selenium Projects//sample.png");
//        FileHandler.copy(sourceFile,destinationFile);

        Robot robot = new Robot();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(screenSize);
        BufferedImage source = robot.createScreenCapture(rectangle);
        File destinationFile = new File("D:\\Selenium Projects//robotSnap.png");
        ImageIO.write(source,"png",destinationFile);


    }
}
