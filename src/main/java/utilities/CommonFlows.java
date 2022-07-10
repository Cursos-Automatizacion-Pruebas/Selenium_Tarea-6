package utilities;

import org.openqa.selenium.WebDriver;
import pageobjects.credentials.LoginPage;
import pageobjects.examples.ExamplePage;
import pageobjects.securedArea.SecuredAreaPage;

public class CommonFlows {
    private final Logs log = new Logs();
    private final WebDriver driver;

    public CommonFlows(WebDriver driver) {
        this.driver = driver;
    }

    public void goToIndex() {
        var examplePage = new ExamplePage(driver);
        examplePage.goToIndex();
        examplePage.waitPageToLoad();
    }

    public void goToLogin() {
        var examplePage = new ExamplePage(driver);
        var loginPage = new LoginPage(driver);
;
        examplePage.clickOnFormAuthentication();
        loginPage.waitPageToLoad();
    }

    public void goToCheckBoxes(){
        var examplePage = new ExamplePage(driver);
        var loginPage = new LoginPage(driver);

        examplePage.clickOnFormAuthentication();
        loginPage.waitPageToLoad();
    }

    public void loginValidUser() {
        var loginPage = new LoginPage(driver);
        var securedArea = new SecuredAreaPage(driver);

        loginPage.fillLogin("tomsmith","SuperSecretPassword!");
        securedArea.waitPageToLoad();
    }
}
