package com.selenium.interviewQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class PaginationTest {
    static String nextText;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://romsunlocked.com/");
        driver.findElement(By.xpath("//input[@id =\"s\"]")).sendKeys("ps3 \n");
        List<String> nameList = new ArrayList<String>();
        List<WebElement> listOfNames;
        WebElement nextButton;
        int sizeOfPagination = driver.findElements(By.className("page-numbers")).size();
        System.out.println(sizeOfPagination);
        if(sizeOfPagination>0){

                do {
                    listOfNames = driver.findElements(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div[2]/div[1]/a"));
                    for (WebElement element:listOfNames){
                        nameList.add(element.getText());
                    }
                    nextButton = driver.findElement(By.className("page-numbers"));
                    nextText = nextButton.getAttribute("text");
                    if(!nextText.contains("19")){
                        nextButton.click();
                    }else {
                        break;
                    }
                }
                while (true);
        }
        else {
            System.out.println("No Pagination is available");
        }
        for (String allNames:nameList){
            System.out.println(allNames);
        }
    }
}
