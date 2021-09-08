package Pages.PolisPages;

import Helpers.RandomCarNumber;
import Helpers.SwipeHelper;
import UserModel.BuyPolisUser;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import Helpers.RandomVinNumberGenerator;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PolisPageFullFilled extends AndroidSetUp {
    private final SelenideElement tapUslugi = $(By.id("service_tab"));

    private final SelenideElement OSAGO = $(By.id("rlInsurance"));

    private final SelenideElement buyInsuranceButton = $(By.id("buyInsuranceButton"));

    private final SelenideElement fill_autonumber = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/" +
            "android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement fill_autonumber_1 = $(By.id("inputET"));

    private final SelenideElement btn_save_auto = $(By.id("saveCarTV"));

    private final SelenideElement choose_city = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]"));

    private final SelenideElement calc_polis = $(By.id("continueTV"));

    private final SelenideElement auto_mark_filled = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement inputET = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText"));

    private final SelenideElement selector_auto_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/" +
            "android.widget.TextView"));

    private final SelenideElement auto_model_filled = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout" +
            "/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement auto_model_filled_aviator = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/" +
            "android.widget.TextView"));


    private final SelenideElement type_car_global = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[4]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/" +
            "android.widget.TextView"));

    private final SelenideElement choose_car_type = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"));

    private final SelenideElement vin_code_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[6]/android.widget.RelativeLayout[2]/" +
            "android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement vin_code_fill = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.LinearLayout/android.widget.EditText"));

    private final SelenideElement save_vin_code = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));

    private final SelenideElement save_date_auto = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.TextView"));

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

    private final SelenideElement cardNumbreType = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/" +
            "android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/" +
            "android.view.View[1]/android.view.View[1]/android.widget.EditText"));

    private final SelenideElement card_date_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/" +
            "android.webkit.WebView/android.view.View/android.view.View/" +
            "android.view.View/android.view.View[2]/android.view.View[6]/" +
            "android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText"));

    private final SelenideElement cardCvvPolis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/" +
            "android.view.View/android.view.View[1]/android.view.View[3]/android.widget.EditText"));

    private final SelenideElement continue_button_credit_card_polis = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[2]/" +
            "android.view.View[6]/android.view.View/android.view.View[3]"));

    private final SelenideElement confirmPurchase = $(By.id("continueTV"));
    // Сделано <-
    // Делаю ->
    private final SelenideElement send_email_polis = $(By.id("defaultId"));

    private final SelenideElement confirm_send_email = $(By.id("continueTV"));

//    Тут Локаторы для некоректного ввода

    private final SelenideElement tap_insurer_name = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/" +
            "android.widget.FrameLayout/android.widget.TextView"));

    private final SelenideElement incorect_name = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/" +
            "android.widget.EditText"));


    private final SelenideElement fill_name_field = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText"));

    private final SelenideElement verify_error_fill_name = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.TextView[1]"));

    private final SelenideElement inn_field = $(By.id("innET"));

    private final SelenideElement cont_btn_after_fill_inn = $(By.id("continueTV"));

    private final SelenideElement payButton = $(By.id("payButton"));

    private final SelenideElement error_check_inn = $(By.id("tv_description"));

    private final SelenideElement tap_passport = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView\n"));

    private final SelenideElement choose1 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.TextView\n"));

    private final SelenideElement choose_passport = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView\n"));

    private final SelenideElement cont_passport = $(By.id("continueTV"));

    private final SelenideElement errINNandReg = $(By.id("tv_description"));

    SwipeHelper atSwipeHelper = new SwipeHelper();


    BuyPolisUser atBuyPolisUser = new BuyPolisUser("Lin", "1111111111", "VSKTVUR20U02226389");

    public void stepBuyPolis() {
        try {
            tapUslugi
                    .shouldBe(Condition.visible).click();
            OSAGO
                    .shouldBe(Condition.visible).click();
            buyInsuranceButton
                    .shouldBe(visible).click();
            fill_autonumber
                    .shouldBe(visible).click();
            fill_autonumber_1
                    .click();
            RandomCarNumber atRandomCarNumber = new RandomCarNumber();
            fill_autonumber_1
                    .sendKeys(atRandomCarNumber.main());
            btn_save_auto
                    .shouldBe(visible).click();
            choose_city
                    .shouldBe(visible).click();
            calc_polis
                    .shouldBe(visible).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //
    public void stepBuyPolisNegative() throws InterruptedException {
        tapUslugi.shouldBe(Condition.visible).click();
        OSAGO.shouldBe(Condition.visible).click();
        buyInsuranceButton.shouldBe(visible).click();
        fill_autonumber.shouldBe(visible).click();
        fill_autonumber_1.click();
        fill_autonumber_1.sendKeys("BC6087HA");
        btn_save_auto.shouldBe(visible).click();
        choose_city.shouldBe(visible).click();
        atSwipeHelper.DownSwipe();
        calc_polis.shouldBe(visible).click();
        choose_franshize.shouldBe(visible).click();
        choose_franshize_money.shouldBe(visible).click();
        Thread.sleep(1000);
        atSwipeHelper.DownSwipe1();
        payment_button_polis.shouldBe(visible).click();
        errINNandReg.shouldHave(text("- Формат Регистрационный номер недействителен. - Тип документа не соответствует льготам"));
    }



    public void StepFullFilled() {
        auto_mark_filled.click();
        inputET.click();
        inputET.sendKeys(atBuyPolisUser.getModelAuto());
        selector_auto_tap.shouldBe(visible).click();
        auto_model_filled.click();
        auto_model_filled_aviator.shouldBe(visible).click();
        type_car_global.shouldBe(visible).click();
        choose_car_type.click();
        vin_code_tap.shouldBe(visible).click();
//
//        Генератор вин номера
        RandomVinNumberGenerator transomVinNumberGenerator = new RandomVinNumberGenerator();
        vin_code_fill.shouldBe(visible).sendKeys(transomVinNumberGenerator.main());
        save_vin_code.shouldBe(visible).click();
        save_date_auto.shouldBe(visible).click();
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
        continue_button_credit_card_polis.shouldBe(visible).click();
    }

    public void checkPurchasePolis() {
        confirmPurchase.shouldBe(visible).click();
        send_email_polis.shouldBe(visible).clear();
        send_email_polis.shouldBe(visible).sendKeys("melnikm078@gmail.com");
        confirm_send_email.shouldBe(visible).click();
    }

    public void skeleton_full_filled() {
        auto_mark_filled.click();
        inputET.click();
        inputET.sendKeys(atBuyPolisUser.getModelAuto());
        selector_auto_tap.shouldBe(visible).click();
        auto_model_filled.click();
        auto_model_filled_aviator.shouldBe(visible).click();
        type_car_global.shouldBe(visible).click();
        choose_car_type.click();
        vin_code_tap.shouldBe(visible).click();
        vin_code_fill.shouldBe(visible).sendKeys(atBuyPolisUser.getVIN());
        save_vin_code.shouldBe(visible).click();
        save_date_auto.shouldBe(visible).click();
        choose_franshize.shouldBe(visible).click();
        choose_franshize_money.shouldBe(visible).click();
        tap_passport.shouldBe(visible).click();
        choose1.shouldBe(visible).click();
        choose_passport.shouldBe(visible).click();
        cont_passport.shouldBe(visible).click();
    }

    public void incorectName() {
        tap_insurer_name.shouldBe(visible).click();
        incorect_name.shouldBe(visible).clear();
        fill_name_field.shouldBe(visible).click();
        fill_name_field.shouldBe(visible).sendKeys("Ыван");
        verify_error_fill_name.shouldBe(visible);
    }

    public void Incorect_INN() {
        try {
            tap_insurer_name.shouldBe(visible).click();
            inn_field.shouldBe(visible).clear();
            inn_field.shouldBe(visible).sendKeys(atBuyPolisUser.getINN());
            cont_btn_after_fill_inn.shouldBe(visible).click();
            payButton.shouldBe(visible).click();
            error_check_inn.shouldBe(visible).shouldHave(text("- Формат ИНН недействителен."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}