package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtilTest {

    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void flash() {
        By emailId = By.name("username");
        By password = By.name("password");
        By login = By.xpath("//*[@id=\"loginForm\"]/div/div/input");
        By menuLinks = By.xpath("//*[@id=\"navbar-collapse\"]/ul");

        JavaScriptUtilTest js = new JavaScriptUtilTest();
        //System.out.println(js.getTitleByJS());
        //driver.findElement(emailId).sendKeys("batchautomation");
        //driver.findElement(password).sendKeys("Test@12345");
        //driver.findElement(login).click();

    }
    @After
    public void exit() {
        //driver.quit();
    }


}
