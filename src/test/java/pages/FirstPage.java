package pages;

import Util.UtilityMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tests.TestBase;

public class FirstPage {

    public FirstPage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthDropDown;

    public void chooseMonthDropDownOption(String monthOption) {
        Select dropdown = new Select(monthDropDown);
        dropdown.selectByVisibleText(monthOption);
    }


}
