package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class GetAllUrls {
    WebDriver driver;

    @Before
      public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
    }
    @Test
     public void allLinks(){
        //print the title of the page
      String title = driver.getTitle();
      System.out.println("Page title is: "+ title );

      String url= " ";
      List<WebElement> totalUrls =  driver.findElements(By.tagName("a"));
      System.out.println("Total links on the Web Page is: "+ totalUrls.size());

      //iterate through the list and will check the elements in the list
        Iterator<WebElement> iterator = totalUrls.iterator();
        while(iterator.hasNext()){
            url = iterator.next().getText();
            System.out.println(url);
        }
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
