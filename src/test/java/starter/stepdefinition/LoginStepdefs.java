package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;

public class LoginStepdefs {
    @Steps
    Login login;
    @Given("I am on login page")
    public void iAmOnLoginPage() {
        login.openUrlLogin();
    }
    @When("I am input my email {string}")
    public void iAmInputMyEmail(String email) {
        login.inputMyEmail("retiamelina@gmail.com");
    }

    @And("I am input my password {string}")
    public void iAmInputMyPassword(String password) {
        login.inputMyPassword("Retiaah10");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.clickLoginButton();
    }

    @Then("I can login")
    public void iCanLogin() {
        login.dashboardIsDisplayed();
    }
}
