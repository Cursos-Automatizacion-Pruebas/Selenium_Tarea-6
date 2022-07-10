package pageobjects.examples;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExamplePage extends BasePage {
    private final By formAuthenticationlink = By.linkText("Form Authentication");
    private final By checkBoxeslink = By.linkText("Checkboxes");
    private final By addRemoveElementslink = By.linkText("Add/Remove Elements");
    private final By statusCodelink = By.linkText("Status Codes");

    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(formAuthenticationlink, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        log.info("Verifying login page UI elements");

        log.info("Verifying form Authentication link is displayed");
        softAssert.assertTrue(verifyIsDisplayed(formAuthenticationlink), "username input is not displayed");
    }

    public void clickOnFormAuthentication() {
        log.info("Clicking on Form Authentication link");
        click(formAuthenticationlink);
    }

    public void clickOnCheckboxeslink() {
        log.info("Clicking on Checkboxes link");
        click(checkBoxeslink);
    }

    public void clickOnAddRemoveElementslink() {
        log.info("Clicking on Add/Remove Elements link");
        click(addRemoveElementslink);
    }

    public void clickOnStatusCodelink() {
        log.info("Clicking on Status Code link");
        click(statusCodelink);
    }
}
