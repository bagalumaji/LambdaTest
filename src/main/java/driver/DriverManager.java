package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Objects;

public final class DriverManager {
    private DriverManager(){}

    private static final ThreadLocal<RemoteWebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public static RemoteWebDriver getDriver() {
        return WEB_DRIVER_THREAD_LOCAL.get();
    }

    static void setDriver(RemoteWebDriver driver) {
        if(Objects.nonNull(driver)) {
            WEB_DRIVER_THREAD_LOCAL.set(driver);
        }
    }

    static void unload() {
        WEB_DRIVER_THREAD_LOCAL.remove();
    }

}
