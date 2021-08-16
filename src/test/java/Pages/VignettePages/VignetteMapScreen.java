package Pages.VignettePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VignetteMapScreen {

    private final SelenideElement mapMenu = $(By.id("maps_tab"));

    private final SelenideElement payRoads = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/" +
            "android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout/android.widget.TextView"));

    private final SelenideElement Country = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]"));

    public void stepMapVignette() {
        mapMenu.shouldBe(visible).click();
        payRoads.shouldBe(visible).click();
        Country.shouldBe(visible).click();
    }
}