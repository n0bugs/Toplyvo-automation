package Pages.VignettePages;

import UserModel.VignetteUser;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class VignetteScreen extends AndroidSetUp {
    private final SelenideElement tapUslugi = $(By.id("service_tab"));

    private final SelenideElement butttonVignette = $(By.id("rlRoadPayment"));

    private final SelenideElement buttonVignetteTV = $(By.id("ua.fuel.debug:id/buyVignetteTV"));

    private final SelenideElement tap_location_car = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"));

    private final SelenideElement car_info = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]/android.widget.TextView"));

    private final SelenideElement car_location = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]"));


    private final SelenideElement car_location_select = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.view.ViewGroup[5]/android.widget.TextView[2]"));


    private final SelenideElement type_car = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]"));


    private final SelenideElement type_car_description = $(By.id("descriptionTV"));

    private final SelenideElement gosNumberCar = $(By.id("carNumberET"));

    private final SelenideElement continueTV = $(By.id("continueTV"));

    private final SelenideElement driverInfo = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[3]/android.widget.TextView"));

    private final SelenideElement name = $(By.id("nameSurnameET"));

    private final SelenideElement inn = $(By.id("passportET"));

    private final SelenideElement orderVignetteET = $(By.id("orderVignetteTV"));

    private final SelenideElement personal_credit = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]/android.widget.TextView"));

    private final SelenideElement final_purchase = $(By.id("tv_pay_tickets"));


    private final SelenideElement check_buy_vignette = $(By.id("statusHintTV"));

    private final SelenideElement tap_final_button = $(By.id("continueTV"));

    public void stepbuyVignette() {
        tapUslugi.shouldBe(Condition.visible).click();
        butttonVignette.shouldBe(Condition.visible).click();
        buttonVignetteTV.shouldBe(visible).click();
        tap_location_car.shouldBe(visible).click();
    }

    VignetteUser atVignetteUser = new VignetteUser("AR6794TR", "Test Test", "12321321");

    public void stepbuyVignette2() {
        car_info.shouldBe(visible).click();
        car_location.shouldBe(visible).click();
        car_location_select.shouldBe(visible).click();
        type_car.shouldBe(visible).click();
        type_car_description.shouldBe(visible).click();
        gosNumberCar.shouldBe(visible).sendKeys(atVignetteUser.getAutoNumber());
        continueTV.shouldBe(visible).click();
        driverInfo.shouldBe(visible).click();
        name.shouldBe(visible).sendKeys(atVignetteUser.getNameSurname());
        inn.shouldBe(visible).sendKeys(atVignetteUser.getINN());
        continueTV.shouldBe(visible).click();
        orderVignetteET.shouldBe(visible).click();
        personal_credit.shouldBe(visible).click();
        final_purchase.shouldBe(visible).click();
        check_buy_vignette.shouldBe(visible);
        tap_final_button.shouldBe(visible).click();
    }
}

