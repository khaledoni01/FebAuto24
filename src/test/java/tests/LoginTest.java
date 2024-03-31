package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.provide_username("Test username");
        loginPage.provide_password("Test password");
        loginPage.validate_baseURL();
    }



}
