package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    @Given("^I open Saucedemo Login page$")
    public void iOpenSaucedemoLoginPage() {
        open("https://www.saucedemo.com/");
    }

    @When("^I input \"([^\"]*)\" to username field$")
    public void iInputToUsernameField(String usernameValue) {
        loginPage.usernameInputField.shouldBe(visible, Duration.ofSeconds(10))
                .setValue(usernameValue);
    }

    @And("^input \"([^\"]*)\" to password field$")
    public void inputToPasswordField(String passwordValue) {
        loginPage.passwordInputField.setValue(passwordValue);
    }

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("^I see the \"([^\"]*)\" error message$")
    public void iSeeTheErrorMessage(String errorMessageValue) {
        loginPage.errorMessage.shouldHave(partialText(errorMessageValue));
    }
}
