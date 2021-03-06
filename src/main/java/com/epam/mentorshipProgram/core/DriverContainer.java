package com.epam.mentorshipProgram.core;

import com.epam.mentorshipProgram.utils.PropertyReader;
import org.openqa.selenium.WebDriver;

public class DriverContainer {
    private static final ThreadLocal<WebDriver> DRIVER_POOL = new ThreadLocal<>();

    private DriverContainer() {
    }

    public static WebDriver createDriver() {
        if (DRIVER_POOL.get() == null) {
            DRIVER_POOL.set(DriverManager.getDriver(PropertyReader.browser));
        }
        return DRIVER_POOL.get();
    }

    public static void quitDriver() {
        if (DRIVER_POOL.get() != null) {
            DRIVER_POOL.get().quit();
            DRIVER_POOL.set(null);
        }
    }

}
