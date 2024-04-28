package tests;

import org.testng.annotations.Test;
import pages.FirstPage;

public class FirstTest extends TestBase {


    @Test(groups = {"regression"})
    public void testMonthDropdown() {
        FirstPage fPage = new FirstPage();

        fPage.chooseMonthDropDownOption("Mar");

    }



}
