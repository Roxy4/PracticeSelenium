package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorTest {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
    }

    @Test
    public void title(){
        String title = driver.getTitle();
        System.out.println("title of the page is " + title);
    }
    @Test
    public void colorText(){

    }


    @After
    public void tearDown(){
        driver.close();

        }
    }
















