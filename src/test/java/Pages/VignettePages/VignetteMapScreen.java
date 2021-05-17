package Pages.VignettePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VignetteMapScreen {

    private SelenideElement mapMenu = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageView"));

    private SelenideElement payRoads = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));

    private SelenideElement Country = $(By.xpath("//android.view.View[@content-desc=\"Румыния. \uD83C\uDDF7\uD83C\uDDF4.\"]"));

    public void stepMapVignette() {
        mapMenu.shouldBe(visible).click();
        payRoads.shouldBe(visible).click();
        Country.shouldBe(visible).click();
    }
}