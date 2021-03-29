package Pages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SocialNetworkPage {

    private SelenideElement getCard = $(By.xpath(""));

    private SelenideElement account = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[5]"));

    private SelenideElement socialBlock = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/" +
            "android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.view.View"));

    private SelenideElement fourthElemCheck = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/" +
            "android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[4]"));

    private SelenideElement wearemarket = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[4]"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void socialNetworkMet() {
        account.shouldBe(visible).click();
        wearemarket.shouldBe(visible).click();
        atSwipeHelper.DownSwipe();
        socialBlock.shouldBe(visible);
        fourthElemCheck.shouldBe(visible);
    }
}
