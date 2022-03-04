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

public class GeicoTesting {
    WebDriver raxu;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        raxu = new ChromeDriver();
        raxu.get("https://ecams.geico.com/login ");
        raxu.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void LoginUser() throws InterruptedException {

        //Using id/name locator:
        // WebElement  email = raxu.findElement(By.id("TextInputComponent-1"));
        // WebElement password = raxu.findElement(By.id("TextInputComponent-2"));
        // WebElement login = raxu.findElement(By.name("SubmitButtonComponent-1"));

        // email.sendKeys("raxu@hotmail.com");
        // password.sendKeys("Myhome234");
        // login.click();

        //Using xpath locator:
        // raxu.findElement(By.xpath("//input[@id='TextInputComponent-1']")).sendKeys("raxuitsutra@gmail.com");
        // raxu.findElement(By.xpath("//input[@id='TextInputComponent-2']")).sendKeys("Geico123");
        // raxu.findElement(By.xpath("//button[@type='submit']")).click();

        //Using css selector:
        raxu.findElement(By.cssSelector("#TextInputComponent-1")).sendKeys("raxuitsutra@gmail.com");
        raxu.findElement(By.cssSelector("#TextInputComponent-2")).sendKeys("Geico123");
        raxu.findElement(By.cssSelector("button[type= 'submit']")).click();
        //Thread.sleep(5000);
    }

    //print the title of the page
    @Test
    public void titlePage(){
        String title = raxu.getTitle();
        System.out.println("Title of the page is: " + title );
    }
    //Total number of images
    @Test
    public void ImageCount() {
       List<WebElement> imageList  = raxu.findElements(By.tagName("img"));
        System.out.println("total number of image: "+ imageList.size());

        for(int i = 0; i<imageList.size(); i++){
            System.out.println(imageList.get(i).getAttribute("src"));
        }
    }

    //Total number of links in the page
    //print the text of each links
    @Test
    public void totalLinks(){
        List<WebElement> linkList= raxu.findElements(By.tagName("a"));
        //System.out.println("Total number of link : "+ linkList );

       int links =  linkList.size();
        System.out.println("total links on the page: "+ links);

        for(int i =0; i<links; i++){
            String linktext = linkList.get(i).getText();

            if(! linktext.isEmpty()){
                System.out.println(i + "------>" + linktext);
                System.out.println();
            }

            System.out.println(linktext);
        }

    }

    @After
    public void exit(){
        raxu.close();

    }

}











