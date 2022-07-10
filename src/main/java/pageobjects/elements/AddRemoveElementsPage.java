package pageobjects.elements;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddRemoveElementsPage extends BasePage {
    private final By addElementBotonLocator = By.tagName("button");
    private final By deleteBotonLocator = By.className("added-manually");

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void verifyPage() {
        log.info("Verifying AddRemoveElements page UI elements");

        log.info("Verifying Add/Remove Elements Buttois displayed");
        softAssert.assertTrue(verifyIsDisplayed(addElementBotonLocator), "username input is not displayed");
        softAssert.assertAll();
    }

    @Override
    public void waitPageToLoad() {
        waitPage(addElementBotonLocator, this.getClass().getSimpleName());
    }

    public void clickOnAddElementButton() {
        log.info("Clicking on Add/Remove Elements Button");
        for (int i = 0; i < 10; i++) {
            click(addElementBotonLocator);
        }
    }

    public void verifyElementsIsDisplayed() {
        clickOnAddElementButton();
        log.info("Verifying 10 delete button is displayed");
        Assert.assertTrue(getElementList(deleteBotonLocator).size() == 10);
    }

    public void clickOnDeleteButton() {
        log.info("Clicking on 10 Delete Button");
        for (var elemento : getElementList(deleteBotonLocator)) {
            elemento.click();
        }
    }

    public void verifyDeleteButtonIsNotDisplayed() {
        clickOnDeleteButton();
        log.info("Verifying 10 delete button is not displayed");
        Assert.assertTrue(getElementList(deleteBotonLocator).size() == 0);
    }
}