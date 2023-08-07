package pageactions;

import driver.DriverManager;
import factory.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public final class SeleniumPageActions {
    private SeleniumPageActions(){}

    public static void waitForElementVisibilityAndClick(WebElement element){
        ExplicitWaitFactory.waitForVisibilityOfElement(element).click();
    }
    public static void waitForElementVisibilityAndClick(By element){
        ExplicitWaitFactory.waitForVisibilityOfElement(element).click();
    }

    public static void waitForElementVisibilityAndTypeText(WebElement element,String message){
        ExplicitWaitFactory.waitForVisibilityOfElement(element).sendKeys(message);
    }
    public static void waitForElementVisibilityAndTypeText(By element,String message){
        ExplicitWaitFactory.waitForVisibilityOfElement(element).sendKeys(message);
    }

    public static String waitForElementVisibilityAndGetText(By element){
        return ExplicitWaitFactory.waitForVisibilityOfElement(element).getText();
    }
    public static boolean waitForElementAndGetCheckedStatus(By element){
        return ExplicitWaitFactory.waitForVisibilityOfElement(element).isSelected();
    }

    public static boolean waitForElementAndGetStatus(By element){
        return ExplicitWaitFactory.waitForVisibilityOfElement(element).isDisplayed();
    }
    public static String getPageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public static void switchToDefaultContent(){
        DriverManager.getDriver().switchTo().defaultContent();
    }

}
