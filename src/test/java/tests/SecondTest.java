package tests;

import org.testng.annotations.Test;
import pages.SecondPage;

public class SecondTest extends TestBase {

    @Test
    public void alertTest() {
        SecondPage sPage = new SecondPage();
        sPage.click_alertButton();
        sPage.handle_alert();
    }

    @Test
    public void hoverOverTest() {
        SecondPage sPage = new SecondPage();
        sPage.hoverOverDropDownButton();
    }





}
