package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecuritySteps {

    WebDriver driver = Hooks.driver;

    @And("I change the security level to {string}")
    public void changeSecurityLevel(String level) {
        WebElement securityDropdown = driver.findElement(By.name("security_level"));
        securityDropdown.click();

        WebElement securityOption = driver.findElement(By.xpath("//option[text()='" + level + "']"));
        securityOption.click();

        driver.findElement(By.name("form_security_level")).click();
    }

    @Then("the security level should be {string}")
    public void verifySecurityLevel(String expectedLevel) {
        WebElement currentLevel = driver.findElement(By.xpath("//*[@id=\"security_level\"]/form/font/b"));
        String actualLevel = currentLevel.getText();

        Assert.assertEquals(expectedLevel, actualLevel);
    }
}
