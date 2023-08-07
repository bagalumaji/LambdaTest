package utils;

import factory.ExplicitWaitFactory;
import org.openqa.selenium.Alert;

public final class AlertUtil {
    private AlertUtil(){}

    public static String getAlertTextAndAcceptIt(){
        Alert alert =   ExplicitWaitFactory.waitForAlertAndSwitchToIt();
        String text = alert.getText();
        alert.accept();
        return text;
    }

}
