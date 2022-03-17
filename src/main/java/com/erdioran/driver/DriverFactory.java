package com.erdioran.driver;

import com.erdioran.exception.FrameworkException;
import org.openqa.selenium.WebDriver;


import java.net.MalformedURLException;

public class DriverFactory {

    private DriverFactory(){}


    public static WebDriver get(Modes mode) throws MalformedURLException {
        WebDriver driver = null;

        if(mode.equals(Modes.LOCALIOS)){
            driver = new LocalDeviceIos().getDriver();
        }
        else if(mode.equals(Modes.LOCALANDROID)){
            driver = new LocalDeviceAndroid().getDriver();
        }
        else if(mode.equals(Modes.BS)){
            driver = new BrowserStackDevice().getDriver();
        }
        else{
            throw new FrameworkException("No cloud provider with the name you mentioned is configured");
        }

        return driver;
    }
}
