package Pages.BonusesPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BonusesTermsPage {

    private SelenideElement bonusesButton = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView"));

    private SelenideElement termsofUse = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.TextView[1]"));


    private SelenideElement checkLastTextBlock = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.ListView/android.view.View[3]/android.widget.TextView"));

    SwipeHelper atSwipeHelper = new SwipeHelper();


    public void bonusesTermsMet() throws InterruptedException {

        bonusesButton.shouldBe(visible).click();
        termsofUse.shouldBe(visible).click();
        Thread.sleep(3000);
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        checkLastTextBlock.shouldBe(visible);

    }
}
