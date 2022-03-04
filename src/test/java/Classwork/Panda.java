package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class Panda {

    WebDriver wd;
    @Before
    public void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.google.com");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void no_of_link_count() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div[2]/div[1]/a/h3/span")).sendKeys("panda");
        Thread.sleep(5000);

        List<WebElement> totallinks = wd.findElements(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/a/h3/span"));
        for (WebElement alllink : totallinks) {
            System.out.println(totallinks);
            if (totallinks.equals(6)) {
                System.out.println("Failed");
            }

        }

    }





  /*lic void verifyCartFunctionality() throws InterruptedException {
        //click on dresses men
        wd.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("panda", Keys.ENTER);
        Thread.sleep(5000);
        List<WebElement> links=wd.findElements(By.cssSelector(".LC20lb.DKV0Md"));
        for (WebElement w: links) {
            //System.out.println(w.getText()+"\n");
            if(w.getText().contains("|")) {  //filtersout and adds to arraylist
                String[] s=w.getText().split("\\|"); //ref to | , array create
                System.out.println(s[1]); //after first |
                if(s[1].contains("Zoo"))
                    System.out.println("1");
                else
                    System.out.println("0");*/

        /*d.findElement(By.name("cusid")).sendKeys("9337");
                 wd.findElement(By.name("submit")).submit();
                 WebDriverWait wait = new WebDriverWait(wd, 30);
                 wait.until(ExpectedConditions.alertIsPresent());
                 //Switch to Alert
                 Alert alert = wd.switchTo().alert();        //get alert message text
                 String alertMsg=wd.switchTo().alert().getText();
                 System.out.println(alertMsg); //Do you really want to delete this customer?
                 alert.dismiss(); // Choose, Cancel button  on the Alert button*/


        }











