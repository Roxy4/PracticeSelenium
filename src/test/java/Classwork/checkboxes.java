package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
    }
    @Test
    public void allCheckBoxes() {
        //print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);


        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/legend"));
        checkBox.click();

        WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
        option1.click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

        WebElement uncheckOption1 = driver.findElement(By.id("checkBoxOption1"));
        uncheckOption1.click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());


        //WebElement countSizes = driver.findElement(By.cssSelector("input[value='checkbox']")).getSize());
        //countSizes.click();
    }

    @After
    public void tearDown() {
        driver.close();
    }


}