package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Test
    public void handleFrame() throws InterruptedException {


        //driver.switchTo().frame("main");
        //driver.switchTo().frame(2);
        driver.switchTo().frame(driver.findElement(By.name("main")));

        WebElement header = driver.findElement(By.xpath("/html/body/h2"));
        System.out.println(header.getText());
        driver.switchTo().defaultContent();
        driver.close();
    }

    @After
    public void exit() {
        driver.quit();
    }
}

