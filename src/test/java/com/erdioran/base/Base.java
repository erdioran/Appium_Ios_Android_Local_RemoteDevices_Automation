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


    public static void tapByPercentages(double xAxis, double yAxis) {
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * xAxis);
        int y = (int) (size.height * yAxis);

        new TouchAction(driver)
                .tap(point(x, y))
                .release().perform();


    }

    public static void sendKeys(String text) {

        Actions action = new Actions(getDriver());
        action.sendKeys(text).perform();
    }


    public static void openApp(String string) {

        driver.activateApp(string);

    }

    public static void terminateApp(String string) {

        driver.terminateApp(string);

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

    public static void waitUntil(AppiumDriver lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }



}



