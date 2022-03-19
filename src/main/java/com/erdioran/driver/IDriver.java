package com.erdioran.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;

public interface IDriver {

    AppiumDriver<MobileElement> getDriver() throws MalformedURLException;

}
