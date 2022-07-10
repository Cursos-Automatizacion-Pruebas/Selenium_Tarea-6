package statuscode;

import base.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.status_codes.StatusCodesPage;


public class StatusCodesTests extends BaseTest {
    private StatusCodesPage statusCodesPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToStatusCodes();
    }

    @Test(groups = {regression})
    public void verifySecuredAreaTest() {
        statusCodesPage.verifyPage();
    }

    @Test(groups = {regression})
    public void verifyUsernameVisibleTest() {
        statusCodesPage.verifyURLStatusCode();
    }

    @Override
    protected void initPages() {
        statusCodesPage = new StatusCodesPage(driver);
    }
}
