package Pages.BuyFuelPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class BuyCreditcardPage extends AndroidSetUp {

    public SelenideElement creditcard = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"));

    public SelenideElement btnpay_tickets = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    public SelenideElement creditCardnumber = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.w" +
            "idget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLay" +
            "out/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view." +
            "View[6]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText"));

    public SelenideElement creditCardcvv = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[2]/android.widget.EditText"));


    public SelenideElement creditCardexpdate = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[3]/android.widget.EditText"));

    public SelenideElement liqpayconfirm = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/" +
            "android.view.View[6]/android.view.View/android.view.View[3]"));

    public SelenideElement thankYoutext = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]"));

    public SelenideElement backtoorigin = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"));

    public SelenideElement paymentchecktitle = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]"));

    SwipeHelper atSwiperHelper = new SwipeHelper();

    public void BuyCredit() {
        creditcard.shouldBe(visible).click();
        btnpay_tickets.shouldBe(visible).click();
        creditCardnumber.waitUntil(visible, 33000).sendKeys("4242424242424242");

        creditCardcvv.waitUntil(visible, 53000).sendKeys("1224");
        creditCardexpdate.waitUntil(visible, 53000).sendKeys("444");
//        atSwiperHelper.DownSwipe();
        liqpayconfirm.waitUntil(visible, 53000).click();
        try {
            thankYoutext.shouldBe(visible);
        }
        catch (NullPointerException e) {
            System.out.println("something went wrong...");
        }
        backtoorigin.shouldBe(visible).click();
        paymentchecktitle.shouldBe(visible);

    }
}