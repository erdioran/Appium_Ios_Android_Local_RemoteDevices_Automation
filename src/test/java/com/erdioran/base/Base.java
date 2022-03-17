package com.erdioran.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.erdioran.driver.DriverManager.getDriver;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class Base {

    static AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) getDriver();


    public static void click(MobileElement mobileElement) {
        mobileElement.click();
    }

    public static void touch(MobileElement mobileElement) {
        new TouchAction(driver)
                .tap(element(mobileElement))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }

    public static void tap(MobileElement mobileElement) {
        new TouchAction(driver)
                .tap(element(mobileElement)).perform();
    }

    public static void touchLocation(int xPoint, int yPoint) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(point(xPoint, yPoint)).perform();
    ;
    }

    public static void sendKeys(String text) {

        Actions action = new Actions(getDriver());
        action.sendKeys(text).perform();
    }


    public static void back() {
        getDriver().navigate().back();
    }

    public static void openApp(String string) {

        driver.activateApp(string);

    }

    public static void terminateApp(String string) {

        driver.terminateApp(string);

    }

    public static void uninstallApp(String string) {

        driver.removeApp(string);

    }

    public static void hideKeyboard() {

        driver.hideKeyboard();

    }

    public static void waitElement(MobileElement mobileElement) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.valueOf(mobileElement))));
    }


}



