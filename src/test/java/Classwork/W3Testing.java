package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class W3Testing {

    WebDriver wd;

    @Before
    public void testing() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }
    @Test
    public void sumTable() {
        double sum = 0.00;// Actual WebElements
        double expectedSum = 90.35;
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row : rows) {
            double nu = Double.parseDouble(row.getText());
            sum = sum + nu;
        }
        Assert.assertEquals(sum, expectedSum, .00);
    }
    @After
    public void exit() {
        wd.quit();
    }


}



