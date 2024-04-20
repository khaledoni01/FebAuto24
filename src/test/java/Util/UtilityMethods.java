package Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestBase;

public class UtilityMethods {

    public static WebDriverWait wait = null;

    public static void waitUntilVisible(WebElement ele) {
        wait = new WebDriverWait(TestBase.driver, 20);
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public static void userInput(WebElement ele, String textValue) {
        ele.clear();
        ele.sendKeys(textValue);
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void jsClick(WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].click();", ele);
    }

}
