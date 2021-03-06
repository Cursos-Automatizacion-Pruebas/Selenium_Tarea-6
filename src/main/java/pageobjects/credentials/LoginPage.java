package pageobjects.credentials;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.className("fa-sign-in");
    private final By cuadradoRojo = By.className("error");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void verifyPage() {
        log.info("Verifying login page UI elements");

        log.info("Verifying username input is displayed");
        softAssert.assertTrue(verifyIsDisplayed(usernameInput), "username input is not displayed");

        log.info("Verifying password input is displayed");
        softAssert.assertTrue(verifyIsDisplayed(passwordInput), "username input is not displayed");

        log.info("Verifying login button is displayed");
        softAssert.assertTrue(verifyIsDisplayed(loginButton), "username input is not displayed");
        softAssert.assertAll();
    }

    @Override
    public void waitPageToLoad() {
        waitPage(usernameInput, this.getClass().getSimpleName());
    }

    public void fillLogin(String username, String password) {
        log.info("Filling username");
        type(usernameInput, username);

        log.info("Filling password");
        type(passwordInput, password);

        log.info("Clicking on login button");
        click(loginButton);
    }

    public void verifyLockedMessageIsDisplayed() {
        log.info("Verifying locked red box is displayed");
        Assert.assertTrue(verifyIsDisplayed(cuadradoRojo));
    }
}
