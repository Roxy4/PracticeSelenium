package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class FacebookTesting {

    WebDriver web;
    @Before
        public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        web = new ChromeDriver();
        web.get("https://www.facebook.com");
        web.manage().window().maximize();
        Thread.sleep(5000);
    }
        @Test
        public void valid_user_invalid_password() throws InterruptedException {
        //Locator for email
        //WebElement email = web.findElement(By.name("email"));
        WebElement email = web.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("binayakregmi@hotmail.com");

        //Locator for password
        //WebElement password = web.findElement(By.xpath("//input[@id='pass']"));
        WebElement password = web.findElement(By.cssSelector("#pass"));
        password.sendKeys("Texas123@");

        //Locator for Log In
        //WebElement login = web.findElement(By.cssSelector("#loginbutton"));
        WebElement login = web.findElement(By.xpath("//button[@id='u_0_b']"));
        login.click();
        Thread.sleep(5000);

        //Expected vs Actual
        String expectedResult= "The password you’ve entered is incorrect. Forgot Password?";
        WebElement errormsg = web.findElement(By.xpath("//*[@class='_9ay7']"));
        Assert.assertEquals(expectedResult,errormsg.getText());
        web.close();

    }
    @Test

    public void verify_day_month_year() throws InterruptedException {
        WebElement day = web.findElement(By.id("day"));
        WebElement month = web.findElement(By.id("month"));
        WebElement year = web.findElement(By.id("year"));

        selectDropDownValue(day, "14");
        selectDropDownValue(month, "Jan");
        selectDropDownValue(year, "1990");
        Thread.sleep(5000);
    }

      public static void selectDropDownValue(WebElement element, String value){
            Select select = new Select(element);
            List<WebElement> valuesList = select.getOptions();
            System.out.println(valuesList.size());
            for (int i = 0; i < valuesList.size(); i++) {
                if (valuesList.get(i).getText().equals(value)) ;
                valuesList.get(i).click();
                break;
            }
        }
   @After
    public void exit(){
       web.close();
    }

   }


