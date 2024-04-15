package com.selenium.advanced;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithDynamicTables {

   static WebDriver driver;
    public void tables(){
        driver.navigate().to("https://leafground.com/table.xhtml;jsessionid=node0wij3smocgei51df59hvvgvync610576.node0");

        //find the columns count
        List<WebElement> columns = driver.findElements(By.xpath("//th[@class=\"ui-state-default ui-sortable-column ui-filter-column\"]"));
        Integer columnsCount = columns.size();
        System.out.println(columnsCount);

        //find the rows count
        List<WebElement> rows = driver.findElements(By.xpath("//tr[@class=\"ui-widget-content ui-datatable-even ui-datatable-selectable\"]"));
        Integer rowsCount = rows.size();
        System.out.println(rowsCount);

        // find the data of the third row fifth column in the table
        WebElement element = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_data\"]/tr[3]/td[5]/span[2]"));
        String status = element.getText();
        System.out.println(status);
        driver.quit();

    }

    public void dynamicTable(){
        driver.navigate().to("https://leafground.com/dynamicgrid.xhtml");

        // find all the data of the fourth column of the table
        List<WebElement> statusList = driver.findElements(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div/div/form/div[2]/div/table/tbody/tr/td[4]"));
        List<Integer> statusList2 = new ArrayList<Integer>();
        for (WebElement webElement:statusList){
            String individualValue = webElement.getText();
            statusList2.add(Integer.parseInt(individualValue));
        }
        System.out.println(STR."Final List: \{statusList2}");
    }
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WorkingWithDynamicTables workingWithDynamicTables = new WorkingWithDynamicTables();
        workingWithDynamicTables.dynamicTable();
        workingWithDynamicTables.tables();
    }
}
