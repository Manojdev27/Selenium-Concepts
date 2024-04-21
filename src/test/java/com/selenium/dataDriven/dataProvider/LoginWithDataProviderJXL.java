package com.selenium.dataDriven.dataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginWithDataProviderJXL {

    String [][] data = null;

    @DataProvider(name = "loginData")
    public String[][] loginDataProvider() throws BiffException, IOException {
        data = getExcelData();
        return data;

    }
    public String[][] getExcelData() throws IOException, BiffException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Manoj Targaryen\\OneDrive\\Documents\\Custom Office Templates\\testdata.xlt");
        Workbook workbook = Workbook.getWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(0);
        int rowCount = sheet.getRows();
        int columnCount = sheet.getColumns();
        String testData[][] = new String[rowCount-1][columnCount];
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                   testData[i-1][j] = sheet.getCell(j,i).getContents();
            }
        }
        return testData;
    }
    @Test(dataProvider = "loginData")
    public void login(String username, String pword){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        userName.sendKeys(username);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys(pword);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
}
