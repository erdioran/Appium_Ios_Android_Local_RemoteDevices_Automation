package com.erdioran.objectRepository;

import com.erdioran.base.Base;
import com.erdioran.driver.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class otherOR extends Base {


    public otherOR() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }


    //TestUser

    public static final String userMail = "testerdioran@gmail.com";
    public static final String password = "12345678Eo";
}
