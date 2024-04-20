package pages;

import Util.UtilityMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tests.TestBase;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    @FindBy(xpath = "//nav[@id='site-navigation']//li/a")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//h1")
    public WebElement pageHeader;

    public void selectMenu(String mOption) {

        for(WebElement menu : menuOptions) {
            String actualMenuText = menu.getText();

            if(mOption.equals(actualMenuText)) {
//                menu.click();
                UtilityMethods.jsClick(menu);
                break;
            }
        }

        UtilityMethods.waitUntilVisible(pageHeader);

        Assert.assertTrue(pageHeader.isDisplayed());

    }



}
