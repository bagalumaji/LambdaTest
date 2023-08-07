package tests;

import base.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.JavascriptAlertPage;

import static constants.JsAlertPageConstants.I_AM_AN_ALERT_BOX_TEXT;

public class TestScenario3 extends TestBase {
    @Test
    public void testScenario3(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        softAssert.assertTrue(homePage.isPageLoaded());
        JavascriptAlertPage javascriptAlertPage = homePage.clickOnJavascriptAlert();
        softAssert.assertTrue(javascriptAlertPage.isPageLoaded());
        String alertText = javascriptAlertPage.clickOnJsAlertButton().getAlertText();
        javascriptAlertPage.switchToDefaultContent();
        softAssert.assertTrue(I_AM_AN_ALERT_BOX_TEXT.contains(alertText.toLowerCase()));
        softAssert.assertAll();
    }
}
