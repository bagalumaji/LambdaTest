package driver;

import java.net.MalformedURLException;
import java.util.Objects;

public  final class Driver {
    private Driver(){}

    public static void initializeDriver(String url,String browser, String version, String platform)  {
        if(Objects.isNull(DriverManager.getDriver())) {
            try {
                DriverManager.setDriver(DriverFactory.getDriver(url,browser,version,platform));

            } catch (MalformedURLException e) {
                throw new RuntimeException("Please check the capabilities of browser");
            }
        }
    }
    public static void closeDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}