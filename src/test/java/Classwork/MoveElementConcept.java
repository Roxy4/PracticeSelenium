package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElementConcept {
    WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
    }
    @Test
    public void contextFunctionality() throws InterruptedException {
        WebElement contextLink= driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"));

        Actions action =new Actions(driver);
        action.moveToElement(contextLink).build().perform();
        Thread.sleep(2000);

        driver.findElement(By.linkText("ARTICLES")).click();
        //driver.findElement(By.linkText("COURSES")).click();
        //driver.findElement(By.linkText("SINGLE VIDEOS")).click();
    }
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
        Thread.sleep(5000);

        driver.findElement(By.id("draggable"));
        driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        //action.dragAndDrop().build().perform();
        //action.clickAndHold().moveToElement(target).release().build().perform();

    }
    @After
    public void exit(){

        driver.close();
}

}
