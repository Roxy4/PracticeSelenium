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

public class ImageCount {

    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sephora.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @Test
    public void imgCount() throws InterruptedException {

        /*WebElement email = driver.findElement(By.name("username"));
    email.sendKeys("romeo123@gmail.com");

    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Snowfall123@");

    WebElement signIn = driver.findElement(By.xpath("//*[@id=\"account_drop_trigger\"]/span/span"));
    signIn.click();*/


        //get total number of images on the pages
        List<WebElement> imageList = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images : " + imageList.size());

        for (int i = 0; i < imageList.size(); i++) {
            System.out.println(imageList.get(i).getAttribute("src"));

            //driver.close();
        }
    }
     @After
        public void exit() {
        driver.quit();
    }
}



















