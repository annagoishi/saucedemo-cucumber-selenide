package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement usernameInputField = $(byId("user-name"));
    public SelenideElement passwordInputField = $(byId("password"));
    public SelenideElement loginButton = $(byId("login-button"));
    public SelenideElement errorMessage = $("[data-test=\"error\"]");
}
