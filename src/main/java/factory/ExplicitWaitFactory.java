package factory;

import constants.Constants;
import driver.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ExplicitWaitFactory {
private ExplicitWaitFactory(){}

    public static WebElement waitForVisibilityOfElement(WebElement element){
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForVisibilityOfElement(By element){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static List<WebElement> waitForVisibilityOfAllElement(WebElement element){
        return getWait().until(ExpectedConditions.visibilityOfAllElements(element));
    }
    public static List<WebElement> waitForVisibilityOfAllElement(By element){
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    public static Alert waitForAlertAndSwitchToIt(){
        return getWait().until(ExpectedConditions.alertIsPresent());
    }

    private static WebDriverWait getWait(){
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(Constants.EXPLICIT_WAIT_INTERVAL));
    }
}
