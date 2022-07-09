package pageobjects.examples;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ExamplePage extends BasePage {
    private final By formAuthenticationlink = By.linkText("Form Authentication");
    private final By checkboxeslink = By.linkText("Checkboxes");

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
        click(checkboxeslink);
    }
}
