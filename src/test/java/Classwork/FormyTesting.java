package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyTesting {
  WebDriver driver;

  @Before
    public void setUp() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://formy-project.herokuapp.com/form");
      driver.manage().window().maximize();
      Thread.sleep(5000);
  }
  @Test
    public void allButtonTesting() throws InterruptedException {
       //print the title of the page
      String title = driver.getTitle();
      System.out.println("Title of the page name is: " + title);

      WebElement firstName = driver.findElement(By.id("first-name"));
      firstName.sendKeys("Shannnon");
      WebElement lastName = driver.findElement(By.id("last-name"));
      lastName.sendKeys("Harris");
      WebElement job = driver.findElement(By.id("job-title"));
      job.sendKeys("Recruiting Manager ");
      Thread.sleep(5000);
  }
  @After
    public void exit(){
    driver.close();
  }

  }








