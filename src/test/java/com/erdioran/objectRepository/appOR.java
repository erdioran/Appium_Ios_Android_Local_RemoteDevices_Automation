package com.erdioran.objectRepository;

import com.erdioran.base.Base;
import com.erdioran.driver.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
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
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public static MobileElement adatepe;

    //Home Page

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewTitle")
    @iOSXCUITFindBy(accessibility = "Konum")
    public static MobileElement location;

    @AndroidFindBy(id = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\"//XCUIElementTypeButton[@name=\"Tümü \"]\"))")
    @iOSXCUITFindBy(id = "com.pozitron.hepsiburada:id/dod_all")
    public static MobileElement locationa;


    public static final By superFiyatSuperTeklifTumu = By.id("com.pozitron.hepsiburada:id/dod_all");
    public static final By superFiyatSuperTeklifTumuIos = By.xpath("//XCUIElementTypeButton[@name=\"Tümü \"]");


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/account_icon")
    @iOSXCUITFindBy(accessibility = "accountButton")
    public static MobileElement myAccount;

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
    @iOSXCUITFindBy(accessibility = "Categories")
    public static MobileElement tabCategories;

    @AndroidFindBy(accessibility = "Anasayfam")
    @iOSXCUITFindBy(accessibility = "Explore")
    public static MobileElement tabHomePage;


    // Categories

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]/android.view.ViewGroup")
    @iOSXCUITFindBy(accessibility = "mainCategoryItemView_1")
    public static MobileElement category2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView")
    @iOSXCUITFindBy(accessibility = "childcategoryitem_1")
    public static MobileElement childCategory2;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/cardViewLocation")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    public static MobileElement yarinKapindaLocationView;

    @AndroidFindBy(id = "??")  ////////////
    @iOSXCUITFindBy(accessibility = "sortButton")
    public static MobileElement sortButton;


    /////


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/textViewLocation")
    @iOSXCUITFindBy(accessibility = "İstanbul")
    public static MobileElement yarinKapidaLocation;


    ///

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='ürün fotoğrafı']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage")
    public static MobileElement firstProduct;


    @AndroidFindBy(accessibility = "ürün fotoğrafı")
    @iOSXCUITFindBy(accessibility = "backBuproductImage1tton")
    public static MobileElement productImage;


    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/leftIcon")
    @iOSXCUITFindBy(accessibility = "backButton")
    public static MobileElement backButtonProduct;


    //public static final By productDetailShare = By.id("com.pozitron.hepsiburada:id/share");

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/share")
    @iOSXCUITFindBy(accessibility = "shareButton")
    public static MobileElement productDetailShare;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/favourite")
    @iOSXCUITFindBy(accessibility = "favoriteButton")
    public static MobileElement productDetailFavouriteIcon;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/product_detail_favourites")
    @iOSXCUITFindBy(accessibility = "favoriButton")
    public static MobileElement productDetailFavouriteIcon2;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/product_detail_add_to_cart")
    @iOSXCUITFindBy(accessibility = "Sepete ekle")
    public static MobileElement addToChart;


    // LOGIN PAGE

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"E-posta adresi veya telefon numarası\"`]")
    public static MobileElement mailEditText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Şifre\"`]")
    public static MobileElement passwordEditText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.Button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Giriş yap\"`]")
    public static MobileElement loginButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
    @iOSXCUITFindBy(accessibility = "Giriş yap")
    public static MobileElement loginButton2;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Tamam")
    public static MobileElement okButtonWelcome;

    @AndroidFindBy(id = "com.pozitron.hepsiburada:id/tvUserNameFull")
    @iOSXCUITFindBy(accessibility = "??")
    public static MobileElement accountPageUserName;


    @AndroidFindBy(accessibility = "account_menu_5")
    @iOSXCUITFindBy(accessibility = "accountitemview_5")
    public static MobileElement myFavourites;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"123\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Listem - hepsiburada\"`]/XCUIElementTypeOther[5]/XCUIElementTypeLink[1]/XCUIElementTypeLink[1]/XCUIElementTypeLink/XCUIElementTypeImage")
    public static MobileElement favouritestListProductImage;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"account_menu_button_15\"]/android.view.ViewGroup/android.widget.Button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Çıkış yap\"`]")
    public static MobileElement logOutButton;


}
