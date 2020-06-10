package Stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Pages.LoginPage.*;
import static Pages.WelcomePage.*;
import static Pages.DragDropPage.*;

public class MyStepdefs {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public  void and(){
        driver.quit();
    }

    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String url) throws InterruptedException {
        navigate(driver,url);
    }

    @When("the user enters username {string}")
    public void theUserEntersUsername(String userName) {
        enterUserName(wait,userName);
    }

    @And("the user enters password {string}")
    public void theUserEntersPassword(String password) {
        enterPassword(wait,password);
    }

    @And("the user clicks sign in button")
    public void theUserClicksSignInButton() {
        clickButton(driver);
    }

//    @Then("the user views {string} to {string} area")
//    public void theUserViewsToArea(String expectedMessage, String area) {
//        viewsMessage(wait,expectedMessage,area);
//    }

    @Then("the user views {string}")
    public void theUserViews(String expectedMessage) {
        viewsMessage(wait,expectedMessage);
    }

    @Then("the user views errorMessage {string}")
    public void theUserViewsErrorMessage(String expectedErrorMessage) {
        viewsErrorMessage(wait,expectedErrorMessage);
    }

    @When("the user drags the {string} to {string}")
    public void theUserDragsTheTo(String arg0, String arg1) throws InterruptedException {
        dragAndDrop(driver,arg0,arg1);
    }

    @Then("the user view {string} message")
    public void theUserViewMessage(String expectedMessage) throws InterruptedException {
        viewMessage(wait,expectedMessage);

    }


}
