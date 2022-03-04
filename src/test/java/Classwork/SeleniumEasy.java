package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy {

    WebDriver wd;
    @Before
    public void click_button() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void testing_click_bottom() {
        WebElement click = wd.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > div.checkbox > label"));
        click.click();
        String str = "Success - Check box is checked";
        String st = wd.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText();
        Assert.assertEquals(str, st);
    }

    @After
    public void exit() {
        wd.quit();
    }
}