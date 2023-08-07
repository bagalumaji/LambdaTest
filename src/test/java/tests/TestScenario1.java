package tests;

import base.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import static constants.HomePageConstants.LAMBDA_TEST;

public class TestScenario1 extends TestBase {
    @Test
    public void testScenario1() {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        softAssert.assertTrue(homePage.isPageLoaded());
        softAssert.assertNotEquals(homePage.getPageTitle(),LAMBDA_TEST);
        softAssert.assertAll();
    }
}
