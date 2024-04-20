package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;

public class SecondPage {

    public SecondPage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    @FindBy(xpath = "//input[@value='Alert Button']")
    public WebElement alertButton;

    @FindBy(xpath = "//button[text()='Dropdown']")
    public WebElement dropDownHoverOverButton;

    public void hoverOverDropDownButton() {
        Actions act = new Actions(TestBase.driver);
        act.moveToElement(dropDownHoverOverButton).build().perform();
    }

    public void click_alertButton() {
        alertButton.click();
    }

    public void handle_alert(){
        Alert alert = TestBase.driver.switchTo().alert();
        alert.accept();

    }
}
