package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer {

    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(" http://automationpractice.com/index.php? ");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Test
    public void testFooterSection() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" http://automationpractice.com/index.php? ");
        driver.manage().window().maximize();
        //Thread.sleep(2000);

        WebElement link = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/h4/a"));
        link.click();
        WebElement footerlink = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div"));
        footerlink.click();

        driver.close();
    }

    @After
    public void exit() {
        driver.quit();
    }

}