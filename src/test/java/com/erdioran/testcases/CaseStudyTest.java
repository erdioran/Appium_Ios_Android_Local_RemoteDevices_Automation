package com.erdioran.testcases;

import com.erdioran.base.Base;
import com.erdioran.driver.Driver;
import com.erdioran.objectRepository.appOR;
import com.erdioran.utils.PropertyUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByIosClassChain;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


import static com.erdioran.base.Base.*;
import static com.erdioran.base.Base.click;
import static com.erdioran.base.Base.horizontalSwipeByPercentagesIOS;
import static com.erdioran.base.Base.horizontalSwipeByPercentagesAndroid;
import static com.erdioran.base.Base.verticalSwipeByPercentagesAndroid;
import static com.erdioran.base.Base.waitUntil;

import static com.erdioran.driver.DriverManager.getDriver;
import static com.erdioran.objectRepository.appOR.*;
import static com.erdioran.objectRepository.appOR.appPackegeName;
import static com.erdioran.objectRepository.appOR.location;
import static com.erdioran.objectRepository.appOR.locationSaveButton;
import static com.erdioran.objectRepository.appOR.cityPicker;
import static com.erdioran.objectRepository.appOR.city;
import static com.erdioran.objectRepository.appOR.adana;
import static com.erdioran.objectRepository.appOR.ceyhan;
import static com.erdioran.objectRepository.appOR.adatepe;
import static com.erdioran.objectRepository.appOR.pickerOK;
import static com.erdioran.objectRepository.appOR.locationSavedClose;
import static com.erdioran.objectRepository.appOR.tabCategories;
import static com.erdioran.objectRepository.appOR.category2;
import static com.erdioran.objectRepository.appOR.childCategory2;
import static com.erdioran.objectRepository.appOR.firstProduct;
import static com.erdioran.objectRepository.appOR.productDetailShare;
import static com.erdioran.objectRepository.appOR.productDetailFavouriteIcon2;
import static com.erdioran.objectRepository.appOR.productDetailFavouriteIcon;
import static com.erdioran.objectRepository.appOR.mailEditText;
import static com.erdioran.objectRepository.appOR.passwordEditText;
import static com.erdioran.objectRepository.appOR.loginButton;
import static com.erdioran.objectRepository.appOR.addToChart;
import static com.erdioran.objectRepository.appOR.okButtonWelcome;
import static com.erdioran.objectRepository.appOR.myAccount;
import static com.erdioran.objectRepository.appOR.myFavourites;
import static com.erdioran.objectRepository.appOR.favouritestListProductImage;
import static com.erdioran.objectRepository.appOR.tabHomePage;
import static com.erdioran.objectRepository.appOR.logOutButton;
import static com.erdioran.objectRepository.appOR.yarinKapindaLocationView;

import static com.erdioran.objectRepository.otherOR.userMail;
import static com.erdioran.objectRepository.otherOR.password;


public class CaseStudyTest extends BaseTest {

    static AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) getDriver();
    private static final Logger LOGGER = LogManager.getLogger(CaseStudyTest.class);
    public static int size;
    String modevalue = PropertyUtils.getValue("mode");

    private WebDriverWait wait;
    private List<WebElement> pickerEls;

    private List<WebElement> pickerEls2;

    private static By pickers = MobileBy.className("XCUIElementTypePickerWheel");
    private static By pickers2 = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Tümü \"`]");


    @Test(priority = 1)
    public void case1() throws InterruptedException {
        appOR homePage = new appOR();
        wait = new WebDriverWait(getDriver(), 10);

        Thread.sleep(1000);
        openApp(appPackegeName);

        // CLICK LOCATION
        waitUntil((AppiumDriver) getDriver(), homePage.location, 10);
        click(location);

        // SELECT CITY
        waitUntil((AppiumDriver) getDriver(), cityPicker, 5);
        click(cityPicker);


        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(city);
        } else if (modevalue.equals("LOCALANDROID")) {
            waitUntil((AppiumDriver) getDriver(), adana, 5);
            click(adana);
        }

        // SELECT DISTRICT
        waitUntil((AppiumDriver) getDriver(), districtPicker, 5);
        click(districtPicker);

        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(district);
        } else if (modevalue.equals("LOCALANDROID")) {
            waitUntil((AppiumDriver) getDriver(), ceyhan, 5);
            click(ceyhan);
        }


        // SELECT NEIGHBORHOOD
        waitUntil((AppiumDriver) getDriver(), neighborhoodPicker, 5);
        click(neighborhoodPicker);
        Thread.sleep(1000);

        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(neighborhood);
        } else if (modevalue.equals("LOCALANDROID")) {
            waitUntil((AppiumDriver) getDriver(), adatepe, 5);
            click(adatepe);
        }


        if (modevalue.equals("LOCALIOS")) {
            waitUntil((AppiumDriver) getDriver(), pickerOK, 5);
            click(pickerOK);
        }

        waitUntil((AppiumDriver) getDriver(), locationSaveButton, 5);
        click(locationSaveButton);

        // CHECK "Konumunuz kaydedildi"
        Assert.assertTrue(locationSaved.isDisplayed());

        waitUntil((AppiumDriver) getDriver(), locationSavedClose, 5);
        click(locationSavedClose);

        waitUntil((AppiumDriver) getDriver(), tabCategories, 5);
        click(tabCategories);

        waitUntil((AppiumDriver) getDriver(), category2, 5);
        click(category2);

        waitUntil((AppiumDriver) getDriver(), childCategory2, 5);
        click(childCategory2);

        // CHECK "Yarın Kapıda Şehir"

        if (modevalue.equals("LOCALIOS")) {
            waitUntil((AppiumDriver) getDriver(), sortButton, 5);

            Assert.assertTrue(yarinKapindaLocationView.isDisplayed());

            Assert.assertTrue(yarinKapidaLocation.isDisplayed());

            Thread.sleep(1000);
        } else if (modevalue.equals("LOCALANDROID")) {
            String a = "com.pozitron.hepsiburada:id/textViewLocation";
            Assert.assertTrue(yarinKapindaLocationView.isDisplayed());
            Thread.sleep(1000);
            Assert.assertEquals(getDriver().findElement(MobileBy.id(a)).getText(), "Adana");
        }


    }


    @Test(priority = 2)
    public void case2() throws InterruptedException {

        appOR homePage = new appOR();
        wait = new WebDriverWait(getDriver(), 10);

        Thread.sleep(2000);
        openApp(appPackegeName);
        waitUntil((AppiumDriver) getDriver(), homePage.location, 10);

        homePage.clickFindElement(appOR.superFiyatSuperTeklifTumu);
        waitUntil((AppiumDriver) getDriver(), firstProduct, 5);
        click(firstProduct);
        Thread.sleep(2000);

        homePage.tapByPercentages(0.5, 0.5);
        Thread.sleep(2000);
        if (modevalue.equals("LOCALIOS")) {
            horizontalSwipeByPercentagesIOS(0.97, 0.01, 0.5);
        } else if (modevalue.equals("LOCALANDROID")) {
            horizontalSwipeByPercentagesAndroid(0.9, 0.1, 0.5);
        }
        Thread.sleep(2000);
        click(productDetailFavouriteIcon);
        Thread.sleep(4000);
        homePage.click(appOR.mailEditText);
        Thread.sleep(2000);
        sendKeys(userMail);
        Thread.sleep(2000);
        homePage.click(appOR.loginButton);
        waitUntil((AppiumDriver) getDriver(), passwordEditText, 5);
        homePage.click(appOR.passwordEditText);
        Thread.sleep(2000);
        sendKeys(password);
        Thread.sleep(2000);
        homePage.click(appOR.loginButton);
        Thread.sleep(2000);
        try {
            click(okButtonWelcome);
        } catch (Exception e) {
            System.out.println("Welcome popup isn't displayed.");
        }
        waitUntil((AppiumDriver) getDriver(), productDetailFavouriteIcon, 5);
        terminateApp(appPackegeName);
        Thread.sleep(2000);

        openApp(appPackegeName);
        waitUntil((AppiumDriver) getDriver(), homePage.location, 10);
        click(myAccount);
        waitUntil((AppiumDriver) getDriver(), myFavourites, 5);

        Assert.assertTrue(accountPageUserName.isDisplayed());

        click(myFavourites);
        Thread.sleep(2000);

        Assert.assertTrue(favouritestListProductImage.isDisplayed());

    }

}





