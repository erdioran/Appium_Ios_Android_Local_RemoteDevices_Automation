package com.erdioran.base;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.erdioran.driver.DriverManager.getDriver;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class Base {

    static AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) getDriver();

    public MobileElement findElement(By by) {
        WebDriverWait appiumWait = new WebDriverWait(getDriver(), 10);
        appiumWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public void clickFindElement(By by) {
        findElement(by).click();
    }


    public static void click(MobileElement mobileElement) {
        mobileElement.click();
    }


    public static void touch(MobileElement mobileElement) {
        new TouchAction(driver)
                .tap(element(mobileElement))
                .waitAction(waitOptions(ofMillis(1500))).perform();
    }

    public static void tap(MobileElement mobileElement) {
        new TouchAction(driver)
                .tap(element((WebElement) mobileElement)).perform();
    }

    public static void tapByPercentages(double xAxis, double yAxis) {
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * xAxis);
        int y = (int) (size.height * yAxis);

        new TouchAction(driver)
                .tap(point(x, y))
                .release().perform();


    }

    public static void touchByPercentages(double xAxis, double yAxis) {
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * xAxis);
        int y = (int) (size.height * yAxis);

        new TouchAction(driver)
                .press(point(x, y))
                .waitAction(waitOptions(ofMillis(500)))
                .release().perform();


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


    public static void horizontalSwipeByPercentagesIOS(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
        new TouchAction(driver)
                .press(point(startPoint,anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint,anchor))
                .release().perform();
    }

    public static void horizontalSwipeByPercentagesAndroid(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
        new TouchAction(driver)
                .press(point(startPoint,anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint,anchor))
                .release().perform();
    }

    public static void verticalSwipeByPercentagesAndroid(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }


    public static void scrollableAreasRightButtonWithPercentage (MobileElement startElement) {
        Dimension size = driver.manage().window().getSize();
        int xRight = (int) (size.width * 0.9146);
        int middleY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 1);
        new TouchAction(driver)
                .tap(point(xRight, middleY))
                .release().perform();
    }

    public static void waitUntil(AppiumDriver lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void appReset(){

        driver.resetApp();
    }


}



