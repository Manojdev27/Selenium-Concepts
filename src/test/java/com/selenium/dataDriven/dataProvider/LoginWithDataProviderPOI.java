package com.selenium.dataDriven.dataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LoginWithDataProviderPOI {
    WebDriver driver;
    static List<String> usernameList = new ArrayList<String>();
    static List<String> passwordList = new ArrayList<String>();

    public void readExcel() throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\Selenium Projects\\testdata.xlsx");
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()){
            Row rowValue = rowIterator.next();
            Iterator<Cell> columnIterator = rowValue.iterator();
            int i =2;
            while (columnIterator.hasNext()){
                if(i%2==0){
                    usernameList.add(columnIterator.next().toString());
                }
                else{
                    passwordList.add(columnIterator.next().getStringCellValue());
                }
                i++;
            }
        }
    }
    @Test
    public void login(String username, String pword){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        userName.sendKeys(username);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys(pword);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
    public void executeTest(){
        for (int i = 0; i < usernameList.size(); i++) {
            login(usernameList.get(i), passwordList.get(i));
        }
    }
    public static void main(String[] args) throws IOException {
      LoginWithDataProviderPOI loginWithDataProviderPOI = new LoginWithDataProviderPOI();
      loginWithDataProviderPOI.readExcel();
      System.out.println("username list is: "+usernameList);
      System.out.println("password list is: "+passwordList);
      loginWithDataProviderPOI.executeTest();
    }
}
