package Pages.PolisPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PolisPage extends AndroidSetUp {
    private final SelenideElement tapUslugi = $(By.id("service_tab"));

    private final SelenideElement OSAGO = $(By.id("rlInsurance"));

    private final SelenideElement buyInsuranceButton = $(By.id("buyInsuranceButton"));

    private final SelenideElement fill_autonumber = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/" +
            "android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement tap_number_auto = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/" +
            "android.widget.TextView[1]");

    private final SelenideElement choose_city = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");

    private final SelenideElement final_reg_number_autobtn = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView[3]"));

    private final SelenideElement choose_franshize = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");

    private final SelenideElement choose_franshize_money = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]");

    private final SelenideElement payment_button_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]"));

    private final SelenideElement cardNumbreType =$(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[1]/android.widget.EditText"));

    private final SelenideElement card_date_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[2]/android.widget.EditText"));

    private final SelenideElement cardCvvPolis = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/" +
            "android.view.View/android.view.View[1]/android.view.View[3]/android.widget.EditText"));

    private final SelenideElement continue_button_credit_card_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/" +
            "android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/" +
            "android.view.View/android.view.View[3]"));

    private final SelenideElement thankYouPage = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"));

    public SelenideElement confirmPurchase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    private final SelenideElement send_email_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));

    private final SelenideElement confirm_send_email = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));

    private final SelenideElement contPurchasse= $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView[2]"));

    private final SelenideElement title_header = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));

    private final SelenideElement tap_passport = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/" +
            "android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement choose1 = $(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/" +
            "android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement choose_passport = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"));

    private final SelenideElement cont_passport = $(By.id("continueTV"));


    public void stepBuyPolis() {
        tapUslugi
                .shouldBe(Condition.visible)
                            .click();
        OSAGO
                .shouldBe(Condition.visible)
                            .click();
        buyInsuranceButton
                .shouldBe(visible)
                            .click();

        fill_autonumber.shouldBe(visible).click();
        tap_number_auto.shouldBe(visible).click();
        choose_city.shouldBe(visible).click();
        final_reg_number_autobtn.shouldBe(visible).click();
        choose_franshize.shouldBe(visible).click();
        choose_franshize_money.shouldBe(visible).click();
        tap_passport.shouldBe(visible).click();
        choose1.shouldBe(visible).click();
        choose_passport.shouldBe(visible).click();
        cont_passport.shouldBe(visible).click();
        payment_button_polis.shouldBe(visible).click();
    }

    public void creditcardpolis() {
        cardNumbreType.shouldBe(visible).sendKeys("4242424242424242");
        card_date_polis.shouldBe(visible).sendKeys("1224");
        cardCvvPolis.shouldBe(visible).sendKeys("123");
        continue_button_credit_card_polis.waitUntil(visible, 53000).click();
        thankYouPage.waitUntil(visible, 53000).click();

    }
    public void checkPurchasePolis(){
        contPurchasse.shouldBe(visible).click();
        send_email_polis.shouldBe(visible).clear();
        send_email_polis.shouldBe(visible).sendKeys("melnikm078@gmail.com");
        confirm_send_email.shouldBe(visible).click();
        title_header.shouldBe(visible);
    }

}


//

//

//