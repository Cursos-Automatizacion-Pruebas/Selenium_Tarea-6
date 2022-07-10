package secured;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.securedArea.SecuredAreaPage;

public class SecureAreaTests extends BaseTest {
    private SecuredAreaPage securedAreaPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToLogin();
        commonFlows.loginValidUser();
    }

    @Test(groups = {regression})
    public void verifySecuredAreaTest() {
        securedAreaPage.verifyPage();
    }

    @Test(groups = {regression})
    public void verifyUsernameVisibleTest() {
        securedAreaPage.clickOnLogoutButton();
        securedAreaPage.verifyUserNameInputIsDisplayed();
    }

    @Override
    protected void initPages() {
        securedAreaPage = new SecuredAreaPage(driver);
    }
}
