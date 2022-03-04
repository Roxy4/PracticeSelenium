package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractise {
    WebDriver wd;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php?");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void logoFunctionality() {

        //WebElement title = wd.findElement(By.cssSelector("#header_logo > a > img"));
        //2.
        WebElement dress = wd.findElement(By.className("sf-with-ul"));
        dress.sendKeys("Saree");
    }
    @Test
    public void verifyEmptyCart(){
        //3.
        WebElement cart = wd.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        String str = "Your shopping cart is empty";
        String st = wd.findElement(By.className("alert alert-warning")).getText();
        Assert.assertEquals(str, st);
    }
    //@Test
    //public void verifyMyAccountFooter(){
        //4.

    @After
    public void exit(){
        wd.quit();
    }
}




/*']")).click();
        JavascriptExecutor js = (JavascriptExecutor) wd;
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1500)");//input invalid email and hit enter key
        WebElement slider = wd.findElement(By.cssSelector(".ui-slider-range.ui-widget-header.ui-corner-all"));
        Actions move = new Actions(wd);
        Thread.sleep(5000);
        int method=2; //Method controller
        if(method==1) {
        for (int i = 1; i <= target; i = i + 10) {
        //slider.sendKeys(Keys.ARROW_RIGHT);
        Action action = move.dragAndDropBy(slider, i, 0).build();
        action.perform();
        }
        }
        if(method==2){
        move.dragAndDropBy(slider,150,0).build().perform();
        }
        Thread.sleep(3000);//verify the label is 53;
        Assert.assertEquals(wd.findElement(By.id("layered_price_range")).getText(),"$53.00 - $53.00");*/






