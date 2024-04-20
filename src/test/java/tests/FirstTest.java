package tests;

import org.testng.annotations.Test;
import pages.FirstPage;

public class FirstTest extends TestBase {


    @Test
    public void testMonthDropdown() {
        FirstPage fPage = new FirstPage();

        fPage.chooseMonthDropDownOption("Mar");

    }



}
