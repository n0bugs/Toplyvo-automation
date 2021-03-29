package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VignetteMapScreen {

    public SelenideElement mapMenu = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageView"));

    public SelenideElement payRoads = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));

    public SelenideElement Country = $(By.xpath("//android.view.View[@content-desc=\"Румыния. \uD83C\uDDF7\uD83C\uDDF4.\"]"));

    public void stepMapVignette() {
        mapMenu.shouldBe(visible).click();
        payRoads.shouldBe(visible).click();
        Country.shouldBe(visible).click();
    }
}