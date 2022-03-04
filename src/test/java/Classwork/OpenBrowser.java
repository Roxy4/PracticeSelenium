package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {

        //Launch browser using  ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();//Maximize the Browser
        Thread.sleep(3000);//Wait for 5secs
        //driver.close();//Close the browser
    }

    @Test
    public void OpenBrowser() throws InterruptedException {

        //Launch browser using Firefox
        //System.setProperty("webdriver.geko.driver", "C:\\Users\\roxie\\Downloads\\geckodriver-v0.27.0-win64.zip");
        WebDriverManager.firefoxdriver().setup();
        WebDriver action = new FirefoxDriver();
        action.get("https://www.macys.com");
        action.navigate().to("https://www.oldnavy.com");
        action.navigate().back();
        action.navigate().forward();
        action.navigate().back();
        action.navigate().refresh();
        action.manage().window().maximize();
        Thread.sleep(5000);
        action.close();
        //action.manage().window().fullscreen();
    }

    @Test
    public void gmailOpenBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);


    }
    @After
    public void tearDown(){
        driver.close();
    }

    }

