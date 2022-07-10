package checks;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.checkboxes.CheckBoxesPage;

public class CheckBoxesTests extends BaseTest {
    private CheckBoxesPage checkBoxesPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        commonFlows.goToCheckBoxes();
    }

    @Test(groups = {regression})
    public void verifyCheckBoxesTest() {
        checkBoxesPage.verifyPage();
    }

    @Test(groups = {regression})
    public void verifyIsNotSelectedChexBox1() {
        checkBoxesPage.isNotSelectedChexBox1();
    }

    @Test(groups = {regression})
    public void verifyIsSelectedChexBox2() {
        checkBoxesPage.isSelectedChexBox2();
    }

    @Test(groups = {regression})
    public void verifyClicOnChecBox1() {
        checkBoxesPage.clickOnCheckbox1();
    }

    @Test(groups = {regression})
    public void verifyClicOnChecBox2() {
        checkBoxesPage.clickOnCheckbox2();
    }

    @Override
    protected void initPages() {
        checkBoxesPage = new CheckBoxesPage(driver);
    }
}
