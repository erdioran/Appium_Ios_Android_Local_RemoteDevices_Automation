package com.erdioran.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDevice implements IDriver{



    public static String userName = "erdioran2";
    public static String accessKey = "EuJAGfxkaqEqvvKxeEwu";
    @Override
    public AppiumDriver<MobileElement> getDriver () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        capabilities.setCapability("device", "Samsung Galaxy S10");
        capabilities.setCapability("os_version", "9.0");
        capabilities.setCapability("project", "Evam SDK");
        capabilities.setCapability("build", "Evam SDK Test Automation");
        capabilities.setCapability("name", "evam");
        capabilities.setCapability("app", "bs://dc2c1df9a73df6e851aba2ef3541ee76b301fc73");

        return new AppiumDriver<MobileElement>(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
    }



}


