package utilities;

import org.openqa.selenium.WebDriver;
import pageobjects.credentials.LoginPage;

public class CommonFlows {
    private final Logs log = new Logs();
    private final WebDriver driver;

    public CommonFlows(WebDriver driver) {
        this.driver = driver;
    }

    public void goToIndex() {
        var loginPage = new LoginPage(driver);

        loginPage.goToIndex();
        loginPage.waitPageToLoad();
    }

    /*public void loginValidUser() {
        var loginPage = new LoginPage(driver);
        loginPage.fillLogin("hola123","hehehe");
    }*/
}
