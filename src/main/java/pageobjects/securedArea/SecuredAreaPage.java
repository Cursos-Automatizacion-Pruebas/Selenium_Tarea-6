package pageobjects.securedArea;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.credentials.LoginPage;

public class SecuredAreaPage extends BasePage {
    private final By logoutbutton = By.linkText("Logout");

    public SecuredAreaPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void verifyPage() {
        log.info("Verifying Secured Area page UI elements");

        log.info("Verifying logout button is displayed");
        Assert.assertTrue(verifyIsDisplayed(logoutbutton), "logout button is not displayed");
     }

    @Override
    public void waitPageToLoad() {
        waitPage(logoutbutton, this.getClass().getSimpleName());
    }

    public void clickOnLogoutButton() {
        log.info("Clicking on logout Button");
        click(logoutbutton);
    }

    public void verifyUserNameInputIsDisplayed() {
        var loginPage = new LoginPage(driver);
        log.info("Verifying username input is displayed");
        Assert.assertTrue(loginPage.isDisplayedUserNameInput(),"username input is not displayed");
    }
}
