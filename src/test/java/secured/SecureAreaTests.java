package secured;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.credentials.LoginPage;
import pageobjects.securedArea.SecuredAreaPage;

public class SecureAreaTests extends BaseTest {
    private SecuredAreaPage securedAreaPage;
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
    public void verifyUsernameVisibleTest() {

        loginPage.fillLogin("tomsmith","SuperSecretPassword!");
        loginPage.verifyRedBoxIsDisplayed();
    }

    @Override
    protected void initPages() {
        securedAreaPage = new SecuredAreaPage(driver);
    }
}
