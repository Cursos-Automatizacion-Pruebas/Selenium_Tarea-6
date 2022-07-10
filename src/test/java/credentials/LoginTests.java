package credentials;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.credentials.LoginPage;

public class LoginTests extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToLogin();
    }

    @Test(groups = {regression})
    public void verifyLoginPageTest() {
        loginPage.verifyPage();
    }

    @Test(groups = {regression})
    public void lockedCredentialsTest() {
        loginPage.fillLogin("hola123","hehehe!");
        loginPage.verifyRedBoxIsDisplayed();
    }

    @Override
    protected void initPages() {
        loginPage = new LoginPage(driver);
    }
}
