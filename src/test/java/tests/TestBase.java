package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

    public static WebDriver driver = null;
//    public static String baseURL = "https://nktechsolutions.com/membership-login/";
//    public static String baseURL = "file:///C:/Users/Khaled%20Zaman/OneDrive/Desktop/pc_backup/NK%20TECH%20Solutions/Automation/WebPage/2ndPage.html";
    public static String baseURL = null;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"baseURL"})
    public void launchBrowser(String baseURL) {
        this.baseURL = baseURL;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);
    }

//    @AfterMethod(alwaysRun = true)
    public void quitBrowser() {
        driver.quit();
    }

}
