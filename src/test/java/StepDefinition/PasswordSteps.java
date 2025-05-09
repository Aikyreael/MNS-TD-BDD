package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordSteps {

    WebDriver driver = Hooks.driver;

    @And("I navigate to the password change page")
    public void goToPasswordChange() {
        driver.findElement(By.linkText("Change Password")).click();
    }

    @And("I change my password from {string} to {string}")
    public void changePassword(String oldPass, String newPass) {
        driver.findElement(By.name("password_curr")).sendKeys(oldPass);
        driver.findElement(By.name("password_new")).sendKeys(newPass);
        driver.findElement(By.name("password_conf")).sendKeys(newPass);
        driver.findElement(By.name("form")).submit();
    }

    @Then("I should see a confirmation message")
    public void confirmPasswordChange() {
        WebElement message = driver.findElement(By.xpath("//*[@id=\"main\"]/font"));
        Assert.assertTrue(message.isDisplayed());
    }
}
