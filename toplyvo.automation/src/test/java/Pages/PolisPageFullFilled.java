package Pages;

import Helpers.RandomCarNumber;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PolisPageFullFilled extends AndroidSetUp {
    public SelenideElement tapUslugi = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[3]"));

    public SelenideElement OSAGO = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[1]/android.widget.ImageView[3]"));

    public SelenideElement buyInsuranceButton = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView"));

    public SelenideElement fill_autonumber = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/" +
            "android.widget.FrameLayout/android.widget.TextView"));

//    public SelenideElement tap_number_auto = $x("/hierarchy/android.widget.FrameLayout/" +
//            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
//            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
//            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/" +
//            "android.widget.TextView[1]");

    public SelenideElement fill_autonumber_1 = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText"));

    public SelenideElement choose_city = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");


//    Todo сделать полное заполнение полей по номеру авто


    public SelenideElement final_reg_number_autobtn = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView[3]"));

    public SelenideElement btn_save_auto = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));

    public SelenideElement auto_mark_filled = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView"));

    public SelenideElement inputET = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText"));

    public SelenideElement selector_auto_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/" +
            "android.widget.TextView"));

    public SelenideElement auto_model_filled = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout" +
            "/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView"));

    public SelenideElement auto_model_filled_aviator = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/" +
            "android.widget.TextView"));

    public SelenideElement type_car_global = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView"));

    public SelenideElement choose_car_type = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[4]/android.widget.TextView"));

    public SelenideElement vin_code_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[6]/android.widget.RelativeLayout[2]/" +
            "android.widget.FrameLayout/android.widget.TextView"));

    public SelenideElement vin_code_fill = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.LinearLayout/android.widget.EditText"));

    public SelenideElement save_vin_code = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));

    public SelenideElement save_date_auto = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView"));

    private final SelenideElement choose_franshize = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");

    public SelenideElement choose_franshize_money = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]");

    public SelenideElement payment_button_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]"));

    private SelenideElement cardNumbreType =$(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[1]/android.widget.EditText"));

    private SelenideElement card_date_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[2]/android.widget.EditText"));

    private  SelenideElement cardCvvPolis = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/" +
            "android.view.View/android.view.View[1]/android.view.View[3]/android.widget.EditText"));

    private SelenideElement continue_button_credit_card_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/" +
            "android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/" +
            "android.view.View[6]/android.view.View/android.view.View[3]"));

    private SelenideElement thankYouPage = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"));

    private SelenideElement confirmPurchase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView[2]"));

    private SelenideElement send_email_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));

    private SelenideElement confirm_send_email = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView[2]"));

    private SelenideElement title_header = $(By.id("ua.fuel.debug:id/title_tv"));



    public void stepBuyPolis() {
        tapUslugi.shouldBe(Condition.visible).click();
        OSAGO.shouldBe(Condition.visible).click();
        buyInsuranceButton.shouldBe(visible).click();
        fill_autonumber.shouldBe(visible).click();
        fill_autonumber_1.click();
        RandomCarNumber atRandomCarNumber = new RandomCarNumber();
        fill_autonumber_1.sendKeys(atRandomCarNumber.main());
        btn_save_auto.shouldBe(visible).click();
        choose_city.shouldBe(visible).click();
        final_reg_number_autobtn.shouldBe(visible).click();
    }

    public void StepFullFilled() {
        auto_mark_filled.click();
        inputET.click();
        inputET.sendKeys("Lin");
        selector_auto_tap.shouldBe(visible).click();
        auto_model_filled.click();
        auto_model_filled_aviator.shouldBe(visible).click();
        type_car_global.shouldBe(visible).click();
        choose_car_type.click();
        vin_code_tap.shouldBe(visible).click();
//        vin_code_fill.shouldBe(visible).click();
        vin_code_fill.shouldBe(visible).sendKeys("VSKTVUR20U02226389");
        save_vin_code.shouldBe(visible).click();
        save_date_auto.shouldBe(visible).click();
        choose_franshize.shouldBe(visible).click();
        choose_franshize_money.shouldBe(visible).click();
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
        confirmPurchase.shouldBe(visible).click();
        send_email_polis.shouldBe(visible).clear();
        send_email_polis.shouldBe(visible).sendKeys("melnikm078@gmail.com");
        confirm_send_email.shouldBe(visible).click();
//        title_header.shouldBe(visible);
    }
}