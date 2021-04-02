package Pages.ProfilePages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class foundationPage {
    private SelenideElement services = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView"));

    private SelenideElement helpFOund = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[5]"));

    private SelenideElement onehundrePercent = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[3]"));

    private SelenideElement donationSwitcher = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/" +
            "android.widget.RelativeLayout/android.widget.Switch"));
//
//    private SelenideElement getCard = $(By.xpath(""));
//
//    private SelenideElement getCard = $(By.xpath(""));
//
//    private SelenideElement getCard = $(By.xpath(""));
//
//    private SelenideElement getCard = $(By.xpath(""));



    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void checkTabletochki() throws InterruptedException {
        services.shouldBe(visible).click();
        helpFOund.shouldBe(visible).click();
        Thread.sleep(3000);
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        onehundrePercent.click();
        donationSwitcher.shouldBe(visible).click();

    }
}

