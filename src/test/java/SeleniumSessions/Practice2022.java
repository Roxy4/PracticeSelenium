package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice2022 {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.aldi.us/");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
    }

    //get the title of the page
    @Test
    public void titlePage() {
        String title = driver.getTitle();
        System.out.println("title of the page is:  " + title);
    }

    //get total number of images on the pages
    @Test
    public void totalImages() {
        List<WebElement> imagesList = driver.findElements(By.tagName("img"));
        System.out.println("total number of  images counts= " + imagesList.size());
    }

    //get the total number of links in a page
    @Test
    public void totalLinks() {
        List<WebElement> LinkLists = driver.findElements(By.tagName("a"));

        int totalLink = LinkLists.size();
        System.out.println("total number of links = " + totalLink);

        for (int i = 0; i < totalLink; i++) {
            String TextLink = LinkLists.get(i).getText();
            System.out.println(TextLink);


        }


    }
        @After
        public void tearDowm () {
            driver.close();
        }
    }
