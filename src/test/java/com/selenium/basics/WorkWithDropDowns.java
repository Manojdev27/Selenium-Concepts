package com.selenium.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkWithDropDowns {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/select.xhtml;jsessionid=node018xpdxsdjwbqg18jqxb7l1a4qp606069.node0");

        // dropdown handling using Select class by index and visible text
        WebElement dropDown = driver.findElement(By.className("ui-selectonemenu"));
        Select select = new Select(dropDown);
        select.selectByIndex(4);
        Thread.sleep(3000);
        select.selectByVisibleText("Selenium");

        List<WebElement> listOfOptions = select.getOptions();
        int size = listOfOptions.size();
        System.out.println("Number of Elements: "+size);

//        dropdown handling using Select class by value
//        WebElement dropDown2 = driver.findElement(By.id("j_idt87:country_input"));
//        Select dropSelect = new Select(dropDown2);
//        dropSelect.selectByValue("India");



    }
}
