import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {

    private final WebDriver driver = new FirefoxDriver();

    @BeforeAll
    public static void setUp() {
        WebDriverMa
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
    }

    @When("I fill in the login form with valid details")
    public void iFillInTheLoginFormWithValidDetails() {
    }

    @And("I submit the login form")
    public void iSubmitTheLoginForm() {
    }

    @Then("I should see a success message")
    public void iShouldSeeASuccessMessage() {
    }
}
