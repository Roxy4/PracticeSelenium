package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DressSaree {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
    }
    @Test
    public void searchSaree(){
        WebElement dress = driver.findElement(By.className("sf-with-ul"));
        dress.sendKeys("Saree");

    }
    @After
    public void tearDown(){
        driver.close();
    }
}
