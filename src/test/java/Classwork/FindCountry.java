package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindCountry {

    WebDriver wd;
    @Before
        public void setup() {

    WebDriverManager.chromedriver().setup();
    wd = new ChromeDriver();
    wd.get("https://www.w3schools.com/html/html_tables.asp");
    wd.manage().window().maximize();
}
    @Test
        public void Total_no_Of_Country(){
        List<WebElement> rows= wd.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
         int rowCount = rows.size();
        System.out.println("Total Number of rows in the table: "+ rowCount);

       // @Test
         //public void
     //List<WelElement> rows = wd.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[3]"));






    }




    }










