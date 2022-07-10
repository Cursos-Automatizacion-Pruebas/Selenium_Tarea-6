package pageobjects.checkboxes;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxesPage extends BasePage {
    private final By checkboxesInput = By.tagName("input");

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(checkboxesInput, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        log.info("Verifying CheckBoxes page UI elements");

        log.info("Verifying checkBox 1 input is displayed");
        softAssert.assertTrue((getElementList(checkboxesInput).get(0).isDisplayed()), "chexBox 1 input is not displayed");

        log.info("Verifying checkBox 2 input is displayed");
        softAssert.assertTrue((getElementList(checkboxesInput).get(1).isDisplayed()), "chexBox 2 input is not displayed");

        softAssert.assertAll();
    }

    public void isNotSelectedChexBox1() {
        log.info("Verificando que checkbox 1 este desmarcado");
        Assert.assertFalse(getElementList(checkboxesInput).get(0).isSelected());
    }

    public void isSelectedChexBox2() {
        log.info("Verificando que checkbox 2 este desmarcado");
        Assert.assertTrue(getElementList(checkboxesInput).get(1).isSelected());
    }

    public void clickOnCheckbox1() {
        log.info("Clicking on Checkboxes link");
        getElementList(checkboxesInput).get(0).click();
        Assert.assertTrue(getElementList(checkboxesInput).get(0).isSelected());
    }

    public void clickOnCheckbox2() {
        log.info("Clicking on Checkboxes link");
        getElementList(checkboxesInput).get(1).click();
        Assert.assertFalse(getElementList(checkboxesInput).get(1).isSelected());
    }
}