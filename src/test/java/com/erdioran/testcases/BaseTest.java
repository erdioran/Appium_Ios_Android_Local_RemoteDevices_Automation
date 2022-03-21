package com.erdioran.testcases;


import com.erdioran.driver.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.ThreadContext;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import static com.erdioran.driver.DriverManager.getDriver;
import static com.erdioran.base.Base.*;
import static com.erdioran.objectRepository.appOR.*;



public class BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);
    static AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) getDriver();


    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method, ITestResult result, ITestContext context) throws MalformedURLException {

        ThreadContext.put("testName", method.getName());
        LOGGER.info("Executing test method : [{}] in class [{}]", result.getMethod().getMethodName(),
                result.getTestClass().getName());

        Driver.initDriver();

    }



    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result, ITestContext context) {
        if (!result.isSuccess()) {

            LOGGER.error("Current test method failed");
            context.setAttribute("previousTestStatus", "failed");
        } else {
            context.setAttribute("previousTestStatus", "passed");
        }
        boolean isCleanUpTest = context.getName().contains("Clean");
        terminateApp(appPackegeName);


    }

    @AfterTest(alwaysRun = true)
    public void afterTestCloseApp(){

        terminateApp(appPackegeName);
    }



    @AfterSuite(alwaysRun = true)
    public void resetApplicaton(){
        terminateApp(appPackegeName);
    }

}
