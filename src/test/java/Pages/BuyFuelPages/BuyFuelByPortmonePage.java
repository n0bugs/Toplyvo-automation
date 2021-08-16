package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BuyFuelByPortmonePage extends AndroidSetUp {

    private final SelenideElement confirmPurchase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    private final SelenideElement testSDK = $(By.id("ua.fuel.debug:id/typeTV"));

    private final SelenideElement cvvInput = $x("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.EditText");

    private final SelenideElement btnPay = $(By.id("btn_pay"));

    public void BuyFuelPortmone() {
        try {
            testSDK.shouldBe(visible).click();
            confirmPurchase.shouldBe(visible).click();
            cvvInput.shouldBe(visible).setValue("111");
            btnPay.shouldBe(visible).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
