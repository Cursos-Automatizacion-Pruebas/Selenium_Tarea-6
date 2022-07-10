package fail;

import base.BaseTest;
import org.testng.annotations.Test;
import pageobjects.credentials.LoginPage;

public class FailedTests extends BaseTest {
    private LoginPage loginPage;

    @Test
    public void failTest1() {
        commonFlows.goToLogin();
        loginPage.verifyPage();
    }

    @Override
    protected void initPages() {
        loginPage = new LoginPage(driver);
    }
}
