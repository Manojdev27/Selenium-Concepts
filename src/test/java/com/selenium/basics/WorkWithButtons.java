package com.selenium.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class WorkWithButtons {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/button.xhtml");
        WebElement button =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]"));
//        button.click();
//        System.out.println(driver.getTitle());

        // the button is visible or not
        WebElement button2 = driver.findElement(By.id("j_idt88:j_idt92"));
        Boolean disable = button2.isEnabled();
        System.out.println(disable);

        // to find the position of the button
        WebElement button3 = driver.findElement(By.id("j_idt88:j_idt94"));
        Point location = button3.getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // to find the color of the button
        WebElement button4 = driver.findElement(By.id("j_idt88:j_idt96"));
        String cssColor = button4.getCssValue("background");

        System.out.println(cssColor);

        // to find the height and width of the button
        WebElement button5 = driver.findElement(By.id("j_idt88:j_idt98"));
        int height = button5.getSize().getHeight();
        System.out.println("height = " + height);
        int width = button5.getSize().getWidth();
        System.out.println("width = " + width);
        


    }
}
