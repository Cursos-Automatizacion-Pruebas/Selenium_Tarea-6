package utilities;

import org.openqa.selenium.WebDriver;
import pageobjects.checkboxes.CheckBoxesPage;
import pageobjects.credentials.LoginPage;
import pageobjects.elements.AddRemoveElementsPage;
import pageobjects.examples.ExamplePage;
import pageobjects.securedArea.SecuredAreaPage;
import pageobjects.status_codes.StatusCodesPage;

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
        var checkboxes = new CheckBoxesPage(driver);

        examplePage.clickOnCheckboxeslink();
        checkboxes.waitPageToLoad();
    }

    public void goToAddRremoveElement(){
        var examplePage = new ExamplePage(driver);
        var eddRemoveElementsPage = new AddRemoveElementsPage(driver);

        examplePage.clickOnAddRemoveElementslink();
        eddRemoveElementsPage.waitPageToLoad();
    }

    public void goToStatusCodes(){
        var examplePage = new ExamplePage(driver);
        var statusCodesPage = new StatusCodesPage(driver);

        examplePage.clickOnStatusCodelink();
        statusCodesPage.waitPageToLoad();
    }

    public void loginValidUser() {
        var loginPage = new LoginPage(driver);
        var securedArea = new SecuredAreaPage(driver);

        loginPage.fillLogin("tomsmith","SuperSecretPassword!");
        securedArea.waitPageToLoad();
    }
}
