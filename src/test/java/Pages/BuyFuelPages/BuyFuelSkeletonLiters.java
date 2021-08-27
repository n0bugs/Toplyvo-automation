package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BuyFuelSkeletonLiters {

    private final SelenideElement buyFuelButton = $(By.id("btn_buy_tickets"));

    private final SelenideElement a92OKKO = $(By.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                    "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                    "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
                    "androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
                    "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/" +
                    "android.widget.RelativeLayout[3]"));

    private final SelenideElement inputLiters = $(By.id("valueInput"));

    private final SelenideElement buyLiters = $(By.id("buyFuelBtn"));

    private final SelenideElement choosePayment = $(By.id("arrow_down_iv"));

    private final SelenideElement tabletopSkip = $(By.id("btn_cancel"));

    public void buyFuelSkeletonLitersMethod() {
        buyFuelButton.shouldBe(visible).click();
        a92OKKO.shouldBe(visible).click();
        inputLiters.shouldBe(visible).sendKeys("10");
        buyLiters.shouldBe(visible).click();
        tabletopSkip.shouldBe(visible).click();
        choosePayment.shouldBe(visible).click();
    }
}

