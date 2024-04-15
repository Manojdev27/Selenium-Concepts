package com.selenium.interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintTheGoogleSuggestions {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Game of Thrones");
        Thread.sleep(5000);
        List<WebElement> searchSuggestions = driver.findElements(By.xpath("//ul[@role =\"listbox\"]//following::li"));
        // print the search suggestions
//        for (WebElement webElement: searchSuggestions){
//        System.out.println(webElement.getText());


//        int position = 0;
        for(WebElement element: searchSuggestions){
//             click a google suggestion based on the text contains
            String text = element.getText();
            System.out.println(text);
            if(text.contains("cast")){
                element.click();
                break;
            }


            // click a google suggestion based on the position
//            System.out.println(element.getText());
//            position++;
//            if(position==3){
//                element.click();
//                break;
//            }

    }
    }
}
