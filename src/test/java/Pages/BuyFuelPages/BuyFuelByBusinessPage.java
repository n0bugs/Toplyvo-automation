package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BuyFuelByBusinessPage {

    private SelenideElement btnContinue = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));

    private SelenideElement businessaccount = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[3]/android.widget.TextView"));

    private SelenideElement chuzpay = $(By.xpath("/hierarchy/android.widget.FrameLayout/a" +
            "ndroid.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/a" +
            "ndroid.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/an" +
            "droid.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/andr" +
            "oid.widget.TextView"));

    private SelenideElement fivethousandclose = $(By.id("ua.fuel.debug:id/ivClose"));

    private SelenideElement confirmPurchase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    private SelenideElement another = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[5]"));

    public void BuyFuelByBusinessPageM() {
        businessaccount.shouldBe(visible).click();
        confirmPurchase.shouldBe(visible).click();
        if (fivethousandclose.isDisplayed())
        {
            fivethousandclose.click();
        }
        btnContinue.shouldBe(visible).click();
    }
    public void BuyFuelByBusinessPageNEGAtive() {
        businessaccount.shouldBe(visible).click();
        confirmPurchase.shouldBe(visible).click();
        another.shouldBe(visible).click();
    }
}
