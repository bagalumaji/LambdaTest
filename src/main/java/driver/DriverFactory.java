package driver;

import optionns.IEBrowserOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static constants.Constants.*;
import static optionns.ChromeBrowserOptions.getChromeOption;
import static optionns.EdgeBrowserOptions.getEdgeOption;
import static optionns.FirefoxBrowserOptions.getFirefoxOption;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static RemoteWebDriver getDriver(String url, String browser, String version, String platform) throws MalformedURLException {
        RemoteWebDriver driver;
        if (browser.toLowerCase().contains("chrome"))
            driver = new RemoteWebDriver(new URL("https://" + USER_NAME + ":" + PASSWORD + GRID_URL), getChromeOption(version, platform));
        else if (browser.toLowerCase().contains("firefox"))
            driver = new RemoteWebDriver(new URL("https://" + USER_NAME + ":" + PASSWORD + GRID_URL), getFirefoxOption(version, platform));
        else if (browser.toLowerCase().contains("edge"))
            driver = new RemoteWebDriver(new URL("https://" + USER_NAME + ":" + PASSWORD + GRID_URL), getEdgeOption(version, platform));
        else if (browser.toLowerCase().contains("internet explorer"))
            driver = new RemoteWebDriver(new URL("https://" + USER_NAME + ":" + PASSWORD + GRID_URL), IEBrowserOptions.getInternetExplorerOptions(version, platform));
        else
            throw new IllegalArgumentException("Unknown browser");

        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        return driver;
    }
}
