package Pages.VignettePages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class VignetteScreen extends AndroidSetUp {
    private SelenideElement tapUslugi = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[3]"));

    private SelenideElement butttonVignette = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[2]/android.widget.ImageView[2]"));

    private SelenideElement buttonVignetteTV = $(By.id("ua.fuel.debug:id/buyVignetteTV"));

    private SelenideElement choosecountry = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]"));

    private SelenideElement tap_info_car = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/" +
            "android.widget.ImageView[2]"));

    private SelenideElement type_car = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));

    private SelenideElement info_driver = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[2]"));

    private SelenideElement info_driver_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]"));

    private SelenideElement tap_purchase_button = $(By.id("orderVignetteTV"));

    private SelenideElement personal_credit = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]/android.widget.TextView"));

    private SelenideElement final_purchase = $(By.id("tv_pay_tickets"));

    private SelenideElement check_buy_vignette = $(By.id("statusHintTV"));

    private SelenideElement tap_final_button = $(By.id("continueTV"));

    private SelenideElement name = $(By.id("nameSurnameET"));

    private SelenideElement inn = $(By.id("passportET"));

    private SelenideElement continueTV = $(By.id("continueTV"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void stepbuyVignette() {
        tapUslugi.shouldBe(Condition.visible).click();
        butttonVignette.shouldBe(Condition.visible).click();
        buttonVignetteTV.shouldBe(visible).click();
        choosecountry.shouldBe(visible).click();
    }

    public void stepbuyVignette2() {
        tap_info_car.shouldBe(visible).click();
        type_car.shouldBe(visible).click();
        info_driver.shouldBe(visible).click();
        name.sendKeys("Test Test");
        inn.sendKeys("12321321");
        continueTV.click();
        tap_purchase_button.shouldBe(visible).click();
        personal_credit.shouldBe(visible).click();
        final_purchase.shouldBe(visible).click();
        check_buy_vignette.shouldBe(visible);
        tap_final_button.shouldBe(visible).click();
    }
}

