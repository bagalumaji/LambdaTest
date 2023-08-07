package utils;

import org.openqa.selenium.By;

public final class ConstructXpathUtil {
    private ConstructXpathUtil(){}
    public static By constructXpath(String xpath, String value) {
        return By.xpath(String.format(xpath, value));
    }
}
