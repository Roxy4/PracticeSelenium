package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruProject {
    private WebDriver driver;

    @Before
    public void seyUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4/manager/Managerhomepage.php ");

        //driver.navigate().to ("http://automationpractice.com/index.php");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().back();
        //driver.navigate().refresh();

        driver.manage().window().fullscreen();
        Thread.sleep(50000);

        //driver.findElement(By.name("uid")).sendKeys("mngr388398");
        //driver.findElement(By.name("password")).sendKeys("aqUjehU");
        //driver.findElement(By.name("btnLogin")).click();
    }

    @Test
    public void getTitle() {
        //get the title of the page
        String title = driver.getTitle();
        System.out.println("the title of the page is: " + title);
    }
    @Test
     public void loginPage() {
    //WebElement userId = driver.findElement(By.name("uid"));
    //userId.sendKeys("mangr388398");

    driver.findElement(By.name("uid")).sendKeys("mngr388398");
    driver.findElement(By.name("password")).sendKeys("aqUjehU");

    // WebElement pwd = driver.findElement(By.name("password"));
    // pwd.sendKeys("aqUjehU");

    driver.findElement(By.name("btnLogin")).click();

}
@After
public void tearDown(){
   driver.close();

}

}
