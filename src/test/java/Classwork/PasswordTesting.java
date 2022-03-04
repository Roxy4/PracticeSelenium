package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordTesting {
    WebDriver raxu ;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver raxu = new ChromeDriver();
        raxu.get("https://www.gmail.com ");
        Thread.sleep(5000);
        raxu.manage().window().maximize();
    }
  @Test
  public void testpassword() throws InterruptedException {

      //WebElement email = raxu.findElement(By.name("identifier"));
      WebElement email = raxu.findElement(By.id("identifierId"));
      //String email = "qatesting00567@gmail.com";
      email.sendKeys("qatesting00567@gmail.com");

      //Use locator for password
      WebElement password = raxu.findElement(By.className("password"));
      password.sendKeys("Text@123");

      //Use locator for NextButton
      WebElement nextbtn = raxu.findElement(By.className("VfPpkd-RLmnJb"));
      nextbtn.click();
      Thread.sleep(5000);
  }

 @After
        public void exit(){
        raxu.close();

      }






  }



