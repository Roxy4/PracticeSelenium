package BddCucumber.StepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver wd;

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(2000);
    }


    @Given("^User is in gmail login page$")
        public void userIsInGmailLoginPage () {
            System.out.println("Method1");

    }
    @When("^Enters valid user in User Field$")
        public void entersValidUserInUserField() {
        wd.findElement(By.className("whsOnd zHQkBf")).sendKeys("qatesting00567@gmail.com");
        System.out.println("Method2");
    }

    @And("^Click next button$")
    public void clickNextButton() {
        wd.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]")).click();
        System.out.println("Method3");
    }

    @And("^Enters valid password in password field$")
    public void entersValidPasswordInPasswordField() throws InterruptedException {
        Thread.sleep(2000);
        wd.findElement(By.className("whsOnd zHQkBf")).sendKeys("Test@123");
        System.out.println("Method4");
    }

    @And("^Click on next button to login$")
    public void clickOnNextButtonToLogin() {
        System.out.println("Method5");
    }

    @Then("^Verify User is on email profile page$")
    public void verifyUserIsOnEmailProfilePage() {
        System.out.println("Method6");
    }

    @And("^Enters in-valid password in password field$")
    public void entersInValidPasswordInPasswordField() {
        System.out.println("Method7");
        
    }
    @Then("^Verify the error message on login page$")
    public void verifyTheErrorMessageOnLoginPage() {
        System.out.println("Method8");
    }

    @After
    public void closeWindow(){
        wd.quit();
    }


}