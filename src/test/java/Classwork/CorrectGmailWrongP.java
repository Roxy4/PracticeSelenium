package Classwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectGmailWrongP {

    @Test
    public void valid_email_invalid_pwd() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver raxu = new ChromeDriver();
        raxu.get("https://www.gmail.com ");
        Thread.sleep(5000);
        raxu.manage().window().maximize();

       //WebElement email = raxu.findElement(By.)




    }



}
