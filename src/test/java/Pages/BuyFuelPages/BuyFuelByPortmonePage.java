package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BuyFuelByPortmonePage extends AndroidSetUp {

    private SelenideElement confirmPurchase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    private SelenideElement testSDK = $(By.id("ua.fuel.debug:id/typeTV"));

    //TO DO актуализировать
    public void BuyFuelPortmone() {

        testSDK.click();
        confirmPurchase.click();

    }
}
