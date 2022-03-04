package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertMsg {

    WebDriver wd;
    @Before
    public void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://demo.guru99.com/test/delete_customer.php");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void handleAlert() {
        //Enter no and cancel the alert
        wd.findElement(By.name("cusid")).sendKeys("159354");
        wd.findElement(By.name("submit")).submit();
        WebDriverWait wait = new WebDriverWait(wd, 20);
        //wait.until(ExpectedConditions.alertIsPresent());

        //Switch to Alert
        Alert alert = wd.switchTo().alert();       //get alert message text
        String alertMsg = wd.switchTo().alert().getText();
        System.out.println(alertMsg);//Do you really want to delete this customer?
        alert.dismiss(); //Choose the cancel button on Alert button
    }
    @After
    public void exit(){

        wd.quit();
    }

}


