package com.erdioran.objectRepository;

import com.erdioran.base.Base;
import com.erdioran.driver.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class appOR extends Base {


    public appOR() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }


    //App ID

    public static final String appPackegeName = "com.pozitron.hepsiburada";
    public static final String appBundleId = "com.pozitron.hepsiburada";

    public static final String city = "İstanbul";
    public static final String district = "Kadıköy";
    public static final String neighborhood = "Erenköy";


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
    public static MobileElement adana;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
    public static MobileElement ceyhan;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public static MobileElement adatepe;

    //Home Page

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewTitle")
    @iOSXCUITFindBy(accessibility = "Konum")
    public static MobileElement location;

    @AndroidFindBy(id = "Hesabım")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement myAccount;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/dod_all")
    @iOSXCUITFindBy(id = "com.pozitron.hepsiburada:id/dod_all")
    public static MobileElement superFiyatSuperTeklifTumu;


    // Location

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"İl seçin\"]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"İl seçin\"`]")
    public static MobileElement cityPicker;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"İlçe seçin\"]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"İlçe seçin\"`]")
    public static MobileElement districtPicker;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Mahalle seçin\"]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Mahalle seçin\"`]")
    public static MobileElement neighborhoodPicker;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/buttonSave")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Kaydet\"`]")
    public static MobileElement locationSaveButton;


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/tvTitle")
    @iOSXCUITFindBy(accessibility = "Konumunuz kaydedildi")
    public static MobileElement locationSaved;


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/ivClose")
    @iOSXCUITFindBy(accessibility = "toastClose")
    public static MobileElement locationSavedClose;


    @iOSXCUITFindBy(accessibility = "Tamam")
    public static MobileElement pickerOK;

    // TAB Bar


    @AndroidFindBy(accessibility = "Kategorilerim")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Kategorilerim\"`]")
    public static MobileElement tabCategories;

    @AndroidFindBy(accessibility = "Anasayfam")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement tabHomePage;


    // Categories

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]/android.view.ViewGroup")
    @iOSXCUITFindBy(accessibility = "mainCategoryItemView_1")
    public static MobileElement category2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView")
    @iOSXCUITFindBy(accessibility = "childcategoryitem_1")
    public static MobileElement childCategory2;


    /////


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewLocation")
    @iOSXCUITFindBy(accessibility = "İstanbul")
    public static MobileElement yarinKapidaLocation;


    ///

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"ürün fotoğrafı\"])[1]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    public static MobileElement firstProduct;


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/productImage")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement productImage;

    @AndroidFindBy(accessibility = "Geri")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement backButtonProduct;

    @AndroidFindBy(accessibility = "favoriye ekle")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement productDetailFavouriteIcon;


    // LOGIN PAGE

    @AndroidFindBy(id = "txtUserName")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement mailEditText;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement passwordEditText;

    @AndroidFindBy(id = "btnLogin")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement loginButton;

    @AndroidFindBy(id = "btnEmailSelect")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement loginButton2;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement okButtonWelcome;


    @AndroidFindBy(accessibility = "account_menu_5")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement myFavourites;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"123\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement favouritestListProductImage;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"account_menu_button_15\"]/android.view.ViewGroup/android.widget.Button")
    @iOSXCUITFindBy(iOSClassChain = "productImage1")
    public static MobileElement logOutButton;


}
