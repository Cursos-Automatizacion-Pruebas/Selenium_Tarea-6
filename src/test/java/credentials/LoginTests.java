package credentials;

import base.BaseTest;
import org.testng.annotations.Test;
import pageobjects.credentials.LoginPage;

public class LoginTests extends BaseTest {
    private LoginPage loginPage;

    @Test(groups = {smoke})
    public void verifyLoginPageTest() {
        loginPage.verifyPage();
    }

    @Test(groups = {regression})
    public void lockedCredentialsTest() {
        loginPage.fillLogin("hola123","hehehe");
        loginPage.verifyLockedMessageIsDisplayed();
    }

    @Override
    protected void initPages() {
        loginPage = new LoginPage(driver);
    }
}
