package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Register;

import java.util.Random;

public class RegisterStepdefs {
    @Steps
    Register register;

    @Given("I am on register page")
    public void iAmOnRegisterPage() {
        register.openUrlRegister();
    }

    @When("I am input name {string}")
    public void iAmInputName(String arg1) {
        register.inputName(arg1);
    }

    @And("I am input email {string}")
    public void iAmInputEmail(String arg2) {
        register.inputEmail(arg2);
    }

    @And("I am input password {string}")
    public void iAmInputPassword(String arg3) {
        register.inputPassword(arg3);
    }

    @Then("I click register button")
    public void iClickRegisterButton() {
        register.clickRegisterButton();
        register.goTOpage();
    }
}
