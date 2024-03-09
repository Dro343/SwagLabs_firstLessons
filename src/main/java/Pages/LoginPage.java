package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage {
    @FindBy(xpath = "//div[@class='login_logo']")
    WebElement topLogo;
    @FindBy(xpath = "//div[text()='Swag Labs']")
    WebElement topLogoWtextProperty;
    @FindBy(id = "user-name")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(id="login_credentials")
    List<WebElement> acceptedUsernames;

}


