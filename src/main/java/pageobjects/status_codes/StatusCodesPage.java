package pageobjects.status_codes;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StatusCodesPage extends BasePage {
    private final By codigo = By.linkText("404");
    private final By here= By.linkText("here");

    public StatusCodesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void verifyPage() {
        log.info("Verifying Status Code page UI elements");

        log.info("Verifying status code is displayed");
        softAssert.assertTrue(verifyIsDisplayed(codigo), "codigo link is not displayed");
        softAssert.assertAll();
    }

    @Override
    public void waitPageToLoad() {
        waitPage(codigo, this.getClass().getSimpleName());
    }

    public void clickOn404() {
        log.info("Clicking on codigo 404 Button");
        click(codigo);
    }

    public void clickOnHere() {
        log.info("Clicking on codigo 404 Button");
        click(here);
    }

    public void verifyURLStatusCode() {
        clickOn404();
        clickOnHere();
        log.info("Verifying Status Code URL is displayed");
        Assert.assertEquals(driver.getCurrentUrl(),"http://the-internet.herokuapp.com/status_codes");
    }
}
