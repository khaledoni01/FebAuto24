package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.File;
import java.io.IOException;

public class LoginTest extends TestBase {

    @DataProvider(name="loginData")
    public static Object[][] loginData() {

        return new Object[][]{
                {"test1_Username", "test1Password"}
        };
    }

    @Test(groups = {"regression", "smoke"}, dataProvider = "loginData")
    public void validLoginTest(String username, String password) {
        LoginPage loginPage = new LoginPage();

        loginPage.provide_username(username);
        loginPage.provide_password(password);

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File("./src/test/java/Test.png"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        loginPage.validate_baseURL();
    }

//    @Test
//    public void validLoginTest2() {
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.provide_username("Test2 username");
//        loginPage.provide_password("Test2 password");
//        loginPage.validate_baseURL();
//    }



}
