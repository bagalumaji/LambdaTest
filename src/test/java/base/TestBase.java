package base;

import driver.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
    @Parameters({"url", "browserName", "browserVersion", "osName"})
    @BeforeClass(alwaysRun = true)
    public void setup(String url, String browserName, String browserVersion, String osName) {
        Driver.initializeDriver(url, browserName, browserVersion, osName);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }
}
