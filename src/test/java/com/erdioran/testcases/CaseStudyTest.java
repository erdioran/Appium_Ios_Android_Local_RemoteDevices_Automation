package com.erdioran.testcases;


import com.erdioran.base.Base;
import com.erdioran.objectRepository.appOR;
import com.erdioran.objectRepository.otherOR;
import com.erdioran.utils.PropertyUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;

import static com.erdioran.base.Base.*;
import static com.erdioran.base.Base.click;
import static com.erdioran.base.Base.horizontalSwipeByPercentagesIOS;
import static com.erdioran.base.Base.horizontalSwipeByPercentagesAndroid;
import static com.erdioran.base.Base.waitUntil;

import static com.erdioran.driver.DriverManager.getDriver;

public class CaseStudyTest extends BaseTest {

    static AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) getDriver();
    private static final Logger LOGGER = LogManager.getLogger(CaseStudyTest.class);

    String modevalue = PropertyUtils.getValue("mode");

    private WebDriverWait wait;
    private List<WebElement> pickerEls;

    private static By pickers = MobileBy.className("XCUIElementTypePickerWheel");


    @Test(priority = 1)
    public void case1() throws InterruptedException {

        Thread.sleep(2000);

        appOR appor = new appOR();
        otherOR otheror = new otherOR();

        wait = new WebDriverWait(getDriver(), 10);

        Thread.sleep(1000);
        openApp(appor.appPackegeName);
        LOGGER.info("Application open SUCCESS");

        // CLICK LOCATION
        waitUntil((AppiumDriver) getDriver(), appor.location, 10);
        click(appor.location);
        LOGGER.info("Location select click SUCCESS");

        // SELECT CITY
        waitUntil((AppiumDriver) getDriver(), appor.cityPicker, 5);
        click(appor.cityPicker);


        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(appor.city);
        } else if (modevalue.equals("LOCALANDROID")) {
            waitUntil((AppiumDriver) getDriver(), appor.adana, 5);
            click(appor.adana);
        }
        LOGGER.info("City select SUCCESS");

        // SELECT DISTRICT
        waitUntil((AppiumDriver) getDriver(), appor.districtPicker, 5);
        click(appor.districtPicker);

        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(appor.district);
        } else if (modevalue.equals("LOCALANDROID")) {
            waitUntil((AppiumDriver) getDriver(), appor.ceyhan, 5);
            click(appor.ceyhan);
        }
        LOGGER.info("District select SUCCESS");

        // SELECT NEIGHBORHOOD
        waitUntil((AppiumDriver) getDriver(), appor.neighborhoodPicker, 5);
        click(appor.neighborhoodPicker);
        Thread.sleep(1000);

        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(appor.neighborhood);
        } else if (modevalue.equals("LOCALANDROID")) {
            waitUntil((AppiumDriver) getDriver(), appor.adatepe, 5);
            click(appor.adatepe);
        }
        LOGGER.info("Neighborhood select SUCCESS");

        if (modevalue.equals("LOCALIOS")) {
            waitUntil((AppiumDriver) getDriver(), appor.pickerOK, 5);
            click(appor.pickerOK);
        }

        waitUntil((AppiumDriver) getDriver(), appor.locationSaveButton, 5);
        click(appor.locationSaveButton);
        LOGGER.info("Location save SUCCESS");

        // CHECK "Konumunuz kaydedildi"
        Assert.assertTrue(appor.locationSaved.isDisplayed(), "Location saved popup displayed");

        waitUntil((AppiumDriver) getDriver(), appor.locationSavedClose, 5);
        click(appor.locationSavedClose);
        LOGGER.info("Location saved popup closed SUCCESS");

        waitUntil((AppiumDriver) getDriver(), appor.tabCategories, 5);
        click(appor.tabCategories);
        LOGGER.info("Categories open SUCCESS");

        waitUntil((AppiumDriver) getDriver(), appor.category2, 5);
        click(appor.category2);
        LOGGER.info("Select category SUCCESS");

        waitUntil((AppiumDriver) getDriver(), appor.childCategory2, 5);
        click(appor.childCategory2);
        LOGGER.info("Select sub category SUCCESS");

        // CHECK "Yarın Kapıda Şehir"

        if (modevalue.equals("LOCALIOS")) {
            waitUntil((AppiumDriver) getDriver(), appor.sortButton, 5);

            try {
                Assert.assertTrue(appor.yarinKapindaLocationView.isDisplayed(), "Yarın Kapında popup is displayed");
            }
            catch (NoSuchElementException e) {
                LOGGER.info("Yarın Kapında popup isn't displayed");
            }
            Assert.assertTrue(appor.yarinKapidaLocation.isDisplayed(),"Yarın Kapında city SUCCESS");

            Thread.sleep(1000);
        } else if (modevalue.equals("LOCALANDROID")) {
            waitUntil((AppiumDriver) getDriver(), appor.sortButton, 5);

            try {
                Assert.assertTrue(appor.yarinKapindaLocationView.isDisplayed(), "Yarın Kapında displayed");
            }
            catch (NoSuchElementException e) {
                LOGGER.info("Yarın Kapında popup isn't displayed");
            }
            String a = "com.pozitron.hepsiburada:id/textViewLocation";
            Assert.assertEquals(getDriver().findElement(MobileBy.id(a)).getText(), "Adana", "Yarın Kapında city SUCCESS");

        }


    }


    @Test(priority = 2)
    public void case2() throws InterruptedException {


        appOR appor = new appOR();
        otherOR otheror = new otherOR();
        wait = new WebDriverWait(getDriver(), 10);

        Thread.sleep(2000);
        openApp(appor.appPackegeName);
        waitUntil((AppiumDriver) getDriver(), appor.location, 10);
        LOGGER.info("Application open SUCCESS");

        appor.clickFindElement(appor.superFiyatSuperTeklifTumu);
        LOGGER.info("Super Fiyat Super Teklif click SUCCESS");

        waitUntil((AppiumDriver) getDriver(), appor.firstProduct, 5);
        click(appor.firstProduct);
        LOGGER.info("Product select SUCCESS");
        Thread.sleep(2000);

        Base.tapByPercentages(0.5, 0.5);
        LOGGER.info("Product image click SUCCESS");
        Thread.sleep(2000);
        if (modevalue.equals("LOCALIOS")) {
            horizontalSwipeByPercentagesIOS(0.97, 0.01, 0.5);
        } else if (modevalue.equals("LOCALANDROID")) {
            horizontalSwipeByPercentagesAndroid(0.9, 0.1, 0.5);
        }
        LOGGER.info("Product image swipe SUCCESS");
        Thread.sleep(2000);
        click(appor.productDetailFavouriteIcon);
        LOGGER.info("Product favourite icon click SUCCESS");
        Thread.sleep(4000);
        Base.click(appOR.mailEditText);
        Thread.sleep(2000);
        sendKeys(otheror.userMail);
        LOGGER.info("Mail input SUCCESS");
        Thread.sleep(2000);
        Base.click(appOR.loginButton);
        waitUntil((AppiumDriver) getDriver(), appor.passwordEditText, 5);
        Base.click(appOR.passwordEditText);
        Thread.sleep(2000);
        sendKeys(otheror.password);
        LOGGER.info("Password input SUCCESS");
        Thread.sleep(2000);
        Base.click(appOR.loginButton);
        Thread.sleep(2000);
        try {
            click(appor.okButtonWelcome);
        } catch (Exception e) {
            System.out.println("Welcome popup isn't displayed.");
        }
        waitUntil((AppiumDriver) getDriver(), appor.productDetailFavouriteIcon, 5);
        LOGGER.info("Login SUCCESS");
        terminateApp(appor.appPackegeName);
        Thread.sleep(2000);
        LOGGER.info("Close open app SUCCESS");

        openApp(appor.appPackegeName);
        LOGGER.info("Open reopen app SUCCESS");
        waitUntil((AppiumDriver) getDriver(), appor.location, 10);
        click(appor.myAccount);
        LOGGER.info("My Account open SUCCESS");
        waitUntil((AppiumDriver) getDriver(), appor.myFavourites, 5);

        Assert.assertTrue(appor.accountPageUserName.isDisplayed());
        LOGGER.info("Check login user SUCCESS");

        click(appor.myFavourites);
        LOGGER.info("Favourites page open SUCCESS");
        Thread.sleep(2000);

        Assert.assertTrue(appor.favouritestListProductImage.isDisplayed());
        LOGGER.info("Check product favourite SUCCESS");
    }

}





