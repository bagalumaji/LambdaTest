package optionns;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

import static constants.Constants.PASSWORD;
import static constants.Constants.USER_NAME;

public final class ChromeBrowserOptions {
    private ChromeBrowserOptions(){}

    public static ChromeOptions getChromeOption(String browserVersion,String osName){
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName(osName);
        browserOptions.setBrowserVersion(browserVersion);
        HashMap<String, Object> ltOptions = new HashMap<>();
        ltOptions.put("username", USER_NAME);
        ltOptions.put("accessKey", PASSWORD);
        ltOptions.put("visual", true);
        ltOptions.put("video", true);
        ltOptions.put("network", true);
        ltOptions.put("project", "Untitled");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        browserOptions.setCapability("LT:Options", ltOptions);
        return browserOptions;
    }
}
