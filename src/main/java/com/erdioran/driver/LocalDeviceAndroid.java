package com.erdioran.driver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.AUTOMATION_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class LocalDeviceAndroid implements  IDriver{

    @Override
    public AppiumDriver<MobileElement> getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability(PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(DEVICE_NAME, "e82d9c6b");
        return new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }
}