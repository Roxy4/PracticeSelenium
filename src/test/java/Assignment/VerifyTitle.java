package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
    }
    @Test
    public void title(){
        //print the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);

    }
    @After
    public void tearDown(){
        driver.close();
    }
}
