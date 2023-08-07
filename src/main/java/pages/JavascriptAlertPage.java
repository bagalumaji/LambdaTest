package pages;

import base.BasePage;
import org.openqa.selenium.By;
import pageactions.SeleniumPageActions;
import utils.AlertUtil;

public class JavascriptAlertPage extends BasePage {
    By btnJsAlert = By.xpath("(//button[text()='Click Me'])[1]");

    @Override
    public boolean isPageLoaded() {
        return SeleniumPageActions.waitForElementAndGetStatus(btnJsAlert);
    }

    public JavascriptAlertPage clickOnJsAlertButton() {
        SeleniumPageActions.waitForElementVisibilityAndClick(btnJsAlert);
        return this;
    }
    public String getAlertText() {
        return AlertUtil.getAlertTextAndAcceptIt();
    }
    public JavascriptAlertPage switchToDefaultContent() {
        SeleniumPageActions.switchToDefaultContent();
        return this;
    }

}
