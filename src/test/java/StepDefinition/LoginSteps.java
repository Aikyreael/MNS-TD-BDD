package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Objects;

public class LoginSteps {

    WebDriver driver = Hooks.driver;

    private final String loginUrl = "http://localhost/login.php";

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver.get(loginUrl);
    }

    @When("I fill in the login form with valid details")
    public void iFillInTheLoginFormWithValidDetails() {
        WebElement usernameElement = driver.findElement(By.name("login"));
        usernameElement.sendKeys("bee");
        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("bug");
    }

    @When("I fill in the login form with {string} and {string}")
    public void iFillInTheLoginFormWithAnd(String username, String password) {
        WebElement usernameElement = driver.findElement(By.name("login"));
        usernameElement.sendKeys("username");
        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("password");
    }

    @And("I submit the login form")
    public void iSubmitTheLoginForm() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/form/button")).click();
    }

    @Then("I should be connected")
    public void iShouldBeConnected() {
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"menu\"]/table/tbody/tr/td[8]/a"));
        Assert.assertTrue(logout.isDisplayed());
        driver.quit();
    }

    @And("I click on logout and accept")
    public void iClickOnLogoutAndAccept() {
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"menu\"]/table/tbody/tr/td[8]/a"));
        logout.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Then("I should not be connected")
    public void iShouldNotBeConnected() {
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"main\"]/font"));
        Assert.assertTrue(errorMessage.isDisplayed());
        driver.quit();
    }

    @Then("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));

        Assert.assertEquals(loginUrl, Objects.requireNonNull(driver.getCurrentUrl()));
        driver.quit();
    }


}
