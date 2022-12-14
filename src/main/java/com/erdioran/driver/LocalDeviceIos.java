package com.erdioran.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class LocalDeviceIos implements  IDriver{

    @Override
    public AppiumDriver<MobileElement> getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability(PLATFORM_VERSION, "15.1");
        capabilities.setCapability(DEVICE_NAME, "ErdiPhone");
        capabilities.setCapability(UDID, ""); // Device UDID ID
        capabilities.setCapability("xcodeOrgId", "");  // XCODE Organization ID
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        return new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }
}
