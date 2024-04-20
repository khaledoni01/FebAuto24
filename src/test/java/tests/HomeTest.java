package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends TestBase {

    @Test
    public void selectMenuTest() {
        HomePage homePage = new HomePage();
        homePage.selectMenu("Training");

    }



}
