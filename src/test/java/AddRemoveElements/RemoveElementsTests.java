package AddRemoveElements;

import base.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.elements.AddRemoveElementsPage;

public class RemoveElementsTests extends BaseTest {
    private AddRemoveElementsPage addRemoveElementsPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToAddRremoveElement();
    }

    @Test(groups = {regression})
    public void verifyAddRemoveElementsTest() {
        addRemoveElementsPage.verifyPage();
    }

    @Test(groups = {regression})
    public void verifyAddRomoveButton() {
        addRemoveElementsPage.verifyElementsIsDisplayed();
        addRemoveElementsPage.verifyDeleteButtonIsNotDisplayed();
    }

    @Override
    protected void initPages() {
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
    }
}
