package com.erdioran.driver;

import com.erdioran.utils.PropertyUtils;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private Driver(){}

    public static void initDriver() throws MalformedURLException {
        if(isNull(DriverManager.getDriver())) {
            String modevalue = PropertyUtils.getValue("mode");
            driver = DriverFactory.get(Modes.valueOf(modevalue.toUpperCase()));
            DriverManager.setDriver(driver);
        }
    }

}
