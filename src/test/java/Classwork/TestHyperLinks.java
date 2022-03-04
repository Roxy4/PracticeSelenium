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

public class TestHyperLinks {

    WebDriver wd;

    @Before
    public void testing() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.amazon.com/");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void verify_hyperlinks() {
        //find the total no. of  hyperlinks in the page
        List<WebElement> linkList = wd.findElements(By.tagName("a"));

        int totalLinks = linkList.size();
        System.out.println("Total number of links on the page: " + totalLinks);
        for (int i = 0; i < totalLinks; i++) {
            String linkText = linkList.get(i).getText();

            if (!linkText.isEmpty()) {
                System.out.print(i + "---->" + linkText + "--->");
                System.out.println(linkList.get(i).getAttribute("href"));
            }
        }
    }
        @Test
        //find total number of images in the page
        public void imgCount () {
            List<WebElement> imageList = wd.findElements(By.tagName("img"));
            System.out.println("Total number of images : " + imageList.size());

            for (int i = 0; i < imageList.size(); i++) {
                System.out.println(imageList.get(i).getAttribute("src"));
            }
        }
        @After
        public void exit() {
            wd.quit();
        }


    }




