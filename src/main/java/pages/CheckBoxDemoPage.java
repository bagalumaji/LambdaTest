package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static pageactions.SeleniumPageActions.*;

public class CheckBoxDemoPage extends BasePage {
    private By singleCheckbox = By.id("isAgeSelected");
    private By textOfSingleCheckbox=By.id("txtAge");

    public CheckBoxDemoPage clickOnSingleCheckbox(){
        waitForElementVisibilityAndClick(singleCheckbox);
        return this;
    }
    public String getTextOfCheckedSingleCheckbox(){
        return waitForElementVisibilityAndGetText(textOfSingleCheckbox);
    }
    public boolean isDisplayedCheckedSingleCheckbox(){
       return waitForElementAndGetCheckedStatus(singleCheckbox);
    }

    @Override
    public boolean isPageLoaded() {
        return waitForElementAndGetStatus(singleCheckbox);
    }
}
