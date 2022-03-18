package com.erdioran.testcases;

import com.erdioran.objectRepository.appOR;
import com.erdioran.utils.PropertyUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
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
import static com.erdioran.objectRepository.appOR.productImage;
import static com.erdioran.objectRepository.appOR.superFiyatSuperTeklifTumu;
import static com.erdioran.objectRepository.appOR.backButtonProduct;
import static com.erdioran.objectRepository.appOR.productDetailFavouriteIcon;
import static com.erdioran.objectRepository.appOR.mailEditText;
import static com.erdioran.objectRepository.appOR.passwordEditText;
import static com.erdioran.objectRepository.appOR.loginButton;
import static com.erdioran.objectRepository.appOR.loginButton2;
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

    private static By pickers = MobileBy.className("XCUIElementTypePickerWheel");

    @Test(priority = 1)
    public void case1() throws InterruptedException {

        wait = new WebDriverWait(getDriver(), 10);

        appOR homePage = new appOR();

        Thread.sleep(1000);
        openApp(appPackegeName);

        // CLICK LOCATION
        waitUntil((AppiumDriver) getDriver(),location,10);
        click(location);

        // SELECT CITY
        waitUntil((AppiumDriver) getDriver(),cityPicker,5);
        click(cityPicker);


        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(city);
        }else if(modevalue.equals("LOCALANDROID")){
            waitUntil((AppiumDriver) getDriver(),adana,5);
            click(adana);
        }

        // SELECT DISTRICT
        waitUntil((AppiumDriver) getDriver(),districtPicker,5);
        click(districtPicker);

        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(district);
        }else if(modevalue.equals("LOCALANDROID")){
            waitUntil((AppiumDriver) getDriver(),ceyhan,5);
            click(ceyhan);
        }


        // SELECT NEIGHBORHOOD
        waitUntil((AppiumDriver) getDriver(),neighborhoodPicker,5);
        click(neighborhoodPicker);
        Thread.sleep(1000);

        if (modevalue.equals("LOCALIOS")) {
            pickerEls = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pickers));
            pickerEls.get(0).sendKeys(neighborhood);
        }else if(modevalue.equals("LOCALANDROID")){
            waitUntil((AppiumDriver) getDriver(),adatepe,5);
            click(adatepe);
        }


        if (modevalue.equals("LOCALIOS")) {
            waitUntil((AppiumDriver) getDriver(),pickerOK,5);
            click(pickerOK);
        }

        waitUntil((AppiumDriver) getDriver(),locationSaveButton,5);
        click(locationSaveButton);

        // CHECK "Konumunuz kaydedildi"
        Assert.assertTrue(locationSaved.isDisplayed());

        waitUntil((AppiumDriver) getDriver(),locationSavedClose,5);
        click(locationSavedClose);

        waitUntil((AppiumDriver) getDriver(),tabCategories,5);
        click(tabCategories);

        waitUntil((AppiumDriver) getDriver(),category2,5);
        click(category2);

        waitUntil((AppiumDriver) getDriver(),childCategory2,5);
        click(childCategory2);

        // CHECK "Yarın Kapıda Şehir"

        if (modevalue.equals("LOCALIOS")) {
            waitUntil((AppiumDriver) getDriver(),yarinKapindaLocationView,5);
            Assert.assertTrue(yarinKapidaLocation.isDisplayed());
            Thread.sleep(1000);
        }else if(modevalue.equals("LOCALANDROID")){
            String a= "com.pozitron.hepsiburada:id/textViewLocation";
            waitUntil((AppiumDriver) getDriver(),yarinKapindaLocationView,5);
            Assert.assertEquals(getDriver().findElement(MobileBy.id(a)).getText(),"Adana");
        }


    }


    @Test(priority = 2)
    public void case2() throws InterruptedException {


        Thread.sleep(2000);
        openApp(appPackegeName);
        Thread.sleep(3000);
        verticalSwipeByPercentagesAndroid(0.8,0.4,0.5);
        Thread.sleep(2000);
        //click(superFiyatSuperTeklifTumu);
        Thread.sleep(2000);
        click(firstProduct);
        Thread.sleep(2000);
        click(productImage);
        Thread.sleep(2000);
        if (modevalue.equals("LOCALIOS")) {
            horizontalSwipeByPercentagesIOS(0.97, 0.01, 0.5);
        }else if(modevalue.equals("LOCALANDROID")){
            horizontalSwipeByPercentagesAndroid(0.97, 0.01, 0.5);
        }
        Thread.sleep(2000);

        click(backButtonProduct);
        Thread.sleep(2000);
        click(productDetailFavouriteIcon);
        Thread.sleep(2000);


        click(mailEditText);
        Thread.sleep(1000);
        sendKeys(userMail);
        Thread.sleep(2000);
        click(loginButton);
        Thread.sleep(1000);
        click(passwordEditText);
        Thread.sleep(1000);
        sendKeys(password);
        Thread.sleep(2000);
        click(loginButton2);

        Thread.sleep(4000);
        click(okButtonWelcome);

        Thread.sleep(2000);
        click(backButtonProduct);

        Thread.sleep(2000);
        click(myAccount);
        Thread.sleep(2000);
        click(myFavourites);

        Thread.sleep(2000);
        Assert.assertTrue(favouritestListProductImage.isDisplayed());

        //CLEAR LIST
        Thread.sleep(2000);
        click(favouritestListProductImage);
        Thread.sleep(2000);
        click(productDetailFavouriteIcon);

        Thread.sleep(2000);
        click(backButtonProduct);
        Thread.sleep(2000);
        click(tabHomePage);
        Thread.sleep(2000);
        click(myAccount);
        Thread.sleep(2000);
        click(logOutButton);
    }

}





