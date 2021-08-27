package Pages.BuyFuelPages;

import UserModel.UserHaveBankCard;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class BuyCreditcardPage extends AndroidSetUp {

    private final SelenideElement creditcard = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"));

    private final SelenideElement btnpay_tickets = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    private final SelenideElement creditCardnumber = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.w" +
            "idget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLay" +
            "out/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view." +
            "View[6]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText"));

    private final SelenideElement creditCardexpdate = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[2]/android.widget.EditText"));

    private final SelenideElement creditCardcvv = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[3]/android.widget.EditText"));

    private final SelenideElement liqpayconfirm = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/" +
            "android.view.View[6]/android.view.View/android.view.View[3]"));

    private final SelenideElement backtoorigin = $(By.id("title_left_iv"));

    UserHaveBankCard atUserHaveBankCard = new UserHaveBankCard("4242424242424242", "1224", "444");

    public void BuyCredit() {
        creditcard.shouldBe(visible).click();
        btnpay_tickets.shouldBe(visible).click();
        creditCardnumber.shouldBe(visible).sendKeys(atUserHaveBankCard.getCardNumber());
        creditCardexpdate.shouldBe(visible).sendKeys(atUserHaveBankCard.getCardDate());
        creditCardcvv.shouldBe(visible).sendKeys(atUserHaveBankCard.getCardCVV());
        liqpayconfirm.shouldBe(visible).click();
        backtoorigin.shouldBe(visible).click();
    }
}