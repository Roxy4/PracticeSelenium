package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlTesting {

    WebDriver driver;

    /*@Before
    public void setUP() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window();
        Thread.sleep(2000);
    }
@Test
    public void loginFunctionality() throws InterruptedException {
        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("harimaya@gmail.com");
        //WebElement password = driver.findElement(By.id("passContainer"));
        //password.sendKeys("password123");
        WebElement loginbtn = driver.findElement(By.name("login"));
        loginbtn.click();

        WebElement creatNewAcc= driver.findElement(By.cssSelector("#u_0_2_Q0"));
        creatNewAcc.click();

        Thread.sleep(2000);


        @Test
                public void test
}
@After
    public void tearDown(){
        driver.close();*/


@Before
public void setUp() throws InterruptedException {


    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.get("https://classic.crmpro.com/");
    driver.manage().window().fullscreen();
    Thread.sleep(5000);
}

@Test
        public void javaScript() {

    By emailid = By.name("username");
    By password = By.name("password");
    By login = By.xpath("//input[@type='submit']");
    By menuLinks = By.cssSelector("ul.nav.navbar-nav.navbar-right");
    By forgotPwd = By.linkText("Forgot Password?");


    //JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
//
//		String innerText = jsUtil.getPageInnerText();
//		System.out.println(innerText);
//
//		if(innerText.contains("Import & Export")){
//			System.out.println("yes, this text is present");
//		}
//
//
//		System.out.println(jsUtil.getBrowserInfo());

    //jsUtil.refreshBrowserByJS();
//		driver.findElement(emailid).sendKeys("batchautomation");
//		driver.findElement(password).sendKeys("Test@12345");
//		//driver.findElement(login).click();
//		jsUtil.clickElementByJS(driver.findElement(login));

//		jsUtil.drawBorder(driver.findElement(login));
//		jsUtil.drawBorder(driver.findElement(menuLinks));

    //jsUtil.flash(driver.findElement(login));

    //jsUtil.generateAlert("login is done");

    //jsUtil.scrollPageDown();
    //jsUtil.scrollIntoView(driver.findElement(forgotPwd));
    //jsUtil.flash(driver.findElement(forgotPwd));

    //jsUtil.sendKeysUsingJSWithId("username", "naveen");


}
}
