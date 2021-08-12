package Pages.ProfilePages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SocialNetworkPage {

    private final SelenideElement account = $(By.id("account_tab"));

    private final SelenideElement socialBlock = $(By.id("rv_social_networks"));

    private final SelenideElement wearemarket = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[4]"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void socialNetworkMet() throws InterruptedException {
        account.shouldBe(visible).click();
        if (wearemarket == wearemarket.shouldBe(visible)){
            wearemarket.click();
        }
        Thread.sleep(3000);
        atSwipeHelper.DownSwipe2();
        socialBlock.shouldBe(visible);
    }
}
