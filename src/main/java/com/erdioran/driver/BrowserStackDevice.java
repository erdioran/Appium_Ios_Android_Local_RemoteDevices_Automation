package com.erdioran.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDevice implements IDriver{



    public static String userName = "";  // username
    public static String accessKey = "";  // accesskey
    @Override
    public AppiumDriver<MobileElement> getDriver () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Samsung Galaxy S10");
        capabilities.setCapability("os_version", "9.0");
        capabilities.setCapability("project", "Hepsiburada SDK");
        capabilities.setCapability("build", "Hepsiburada Test Automation");
        capabilities.setCapability("name", "hepsiburada");
        capabilities.setCapability("app", "");  // APP BS id

        return new AppiumDriver<MobileElement>(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
    }



}


