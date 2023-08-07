package pages;

import base.BasePage;
import factory.ExplicitWaitFactory;
import org.openqa.selenium.By;
import pageactions.SeleniumPageActions;

import static constants.HomePageConstants.*;
import static pageactions.SeleniumPageActions.waitForElementVisibilityAndClick;
import static utils.ConstructXpathUtil.constructXpath;

public class HomePage extends BasePage {
    private By MENU = By.xpath("//div[@class='inline-block dropdown desktop:block resource-dropdown']");

    private static final String XPATH_VISIBLE_TEXT="//a[normalize-space()='%s']";
    @Override
    public boolean isPageLoaded() {
        return ExplicitWaitFactory.waitForVisibilityOfAllElement(MENU).size() > 0;
    }

    public String getPageTitle() {
        return SeleniumPageActions.getPageTitle();
    }

    public CheckBoxDemoPage clickOnDemoCheckBox(){
        waitForElementVisibilityAndClick(constructXpath(XPATH_VISIBLE_TEXT, CHECKBOX_DEMO_TEXT));
        return new CheckBoxDemoPage();
    }
    public JavascriptAlertPage clickOnJavascriptAlert(){
        waitForElementVisibilityAndClick(constructXpath(XPATH_VISIBLE_TEXT, JAVASCRIPT_ALERTS_TEXT));
        return new JavascriptAlertPage();
    }


}
