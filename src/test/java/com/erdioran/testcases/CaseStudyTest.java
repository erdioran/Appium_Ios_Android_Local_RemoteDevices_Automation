package com.erdioran.testcases;

import com.erdioran.objectRepository.appOR;
import com.erdioran.utils.PropertyUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static com.erdioran.base.Base.*;
import static com.erdioran.driver.DriverManager.getDriver;
import static com.erdioran.objectRepository.appOR.appPackegeName;

public class CaseStudyTest extends BaseTest {

    static AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) getDriver();
    private static final Logger LOGGER = LogManager.getLogger(CaseStudyTest.class);
    public static int size;
    String modevalue = PropertyUtils.getValue("mode");


    @Test(priority = 1)
    public void case1() throws InterruptedException {


        //appOR homePage = new appOR();

        Thread.sleep(1000);
        openApp(appPackegeName);
        Thread.sleep(1000);

    }
}



