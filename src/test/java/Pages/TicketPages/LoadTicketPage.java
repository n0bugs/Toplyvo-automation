package Pages.TicketPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class LoadTicketPage {

    private final SelenideElement clickShowMore = $(By.id("load_more_tickets_button"));

    private final SelenideElement shoudBeVisibleTicket = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/" +
            "android.widget.LinearLayout/android.widget.TextView"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void LoadTicketStep() {
        atSwipeHelper.ScrollToShowTicket();
        atSwipeHelper.DownSwipe2();
        atSwipeHelper.DownSwipe2();
        atSwipeHelper.DownSwipe2();
        atSwipeHelper.DownSwipe2();
        atSwipeHelper.DownSwipe2();
        clickShowMore.shouldBe(visible).shouldHave(text("Показать ещё")).click();
        shoudBeVisibleTicket.shouldBe(visible);
    }
}
