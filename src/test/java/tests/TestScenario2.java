package tests;

import base.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CheckBoxDemoPage;
import pages.HomePage;

public class TestScenario2 extends TestBase {
    @Test
    public void testScenario2() {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        softAssert.assertTrue(homePage.isPageLoaded());
        CheckBoxDemoPage checkBoxDemoPage = homePage.clickOnDemoCheckBox();
        checkBoxDemoPage.isPageLoaded();
        boolean displayedCheckedSingleCheckbox = checkBoxDemoPage
                .clickOnSingleCheckbox()
                .isDisplayedCheckedSingleCheckbox();
        softAssert.assertTrue(displayedCheckedSingleCheckbox);
        displayedCheckedSingleCheckbox = checkBoxDemoPage.clickOnSingleCheckbox().isDisplayedCheckedSingleCheckbox();
        softAssert.assertFalse(displayedCheckedSingleCheckbox);
        softAssert.assertAll();
    }
}

