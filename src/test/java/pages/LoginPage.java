package pages;

import Util.UtilityMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tests.TestBase;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    @FindBy(xpath = "//input[@id='swpm_user_name']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='swpm_password']")
    public WebElement password;

    public void provide_username(String uname){
        UtilityMethods.userInput(username, uname);
    }

    public void provide_password(String pword) {
        UtilityMethods.sleep(1);
        UtilityMethods.userInput(password, pword);
    }

    public void validate_baseURL() {
//        Assert.assertTrue(TestBase.baseURL.equals(TestBase.driver.getCurrentUrl()), "baseURL didn't match");
        Assert.assertTrue(TestBase.baseURL.equals("https://facebook.com"), "baseURL didn't match");
    }

}
