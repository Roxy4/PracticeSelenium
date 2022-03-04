package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Amazon {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
    }
    //print the title of the page
    @Test
    public void Title(){
       String title =  driver.getTitle();
        System.out.println("title of the page is " + title);
    }
    //total no.of images in the page with src
    @Test
     public void totalImages() {
        List<WebElement> imageList = driver.findElements(By.tagName("img"));
        System.out.println("total number of images : " + imageList.size());

        for (int i = 0; i < imageList.size(); i++) {
            System.out.println(imageList.get(i).getAttribute("src"));
        }
    }
    //total number of links in the page
    //print with the text
    @Test
     public void totallinks(){
            List<WebElement> links= driver.findElements(By.tagName("a"));
        //System.out.println("total number of links: " + links.size());

       int list =  links.size();
        System.out.println("Total number  of link on the page : "+ list);

        for(int i = 0; i <list ; i++) {
            String linkText = links.get(i).getText();
        }
    }
    @Test
    public void login() throws IOException {
    WebElement email = driver.findElement(By.name("email"));//sendKeys("binayakregmi@gmail.com");
    WebElement password= driver.findElement(By.name("password"));//sendKeys("Biranogau152@123");
    WebElement signIn = driver.findElement(By.id("signInSubmit"));//click();*/

    File srcFile =email.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./target/screenshots/email.png "));
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
