package Pages.VigenttePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class VignetteScreen extends AndroidSetUp {
    public SelenideElement tapUslugi = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[3]"));

    public SelenideElement butttonVignette = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[2]/android.widget.ImageView[2]"));

    public SelenideElement buttonVignetteTV = $(By.id("ua.fuel.debug:id/buyVignetteTV"));

    public SelenideElement choosecountry = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]"));

    public SelenideElement tap_info_car = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/" +
            "android.widget.ImageView[2]"));

    public SelenideElement type_car = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));

    public SelenideElement info_driver = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[2]"));

    public SelenideElement info_driver_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]"));

    public SelenideElement tap_purchase_button = $(By.id("ua.fuel.debug:id/orderVignetteTV"));

    public SelenideElement personal_credit = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]/android.widget.TextView"));

    public SelenideElement final_purchase = $(By.id("ua.fuel.debug:id/tv_pay_tickets"));

    public SelenideElement check_buy_vignette = $(By.id("ua.fuel.debug:id/statusHintTV"));

    public SelenideElement tap_final_button = $(By.id("ua.fuel.debug:id/continueTV"));

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
        info_driver_tap.shouldBe(visible).click();
        tap_purchase_button.shouldBe(visible).click();
        personal_credit.shouldBe(visible).click();
        final_purchase.shouldBe(visible).click();
        check_buy_vignette.shouldBe(visible);
        tap_final_button.shouldBe(visible).click();
    }
}

