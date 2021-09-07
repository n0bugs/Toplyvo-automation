package Pages.BuyFuelPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SwipeTicketToArchive {
    private final SelenideElement ticket = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout"));
    private final SelenideElement ticket_status_tv = $(By.id("ticket_status_tv"));
    private final SelenideElement qr_code_iv = $(By.id("qr_code_iv"));

    private final SelenideElement archiveTickets = $(By.id("archiveTickets"));
    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void SwipeActionStep() {
        SwipeAction();
        archiveTickets.shouldBe(visible).click();
        atSwipeHelper.swipeScreenToArchive();
        ticket.shouldBe(visible).click();
        ticket_status_tv.shouldBe(visible).click();
        qr_code_iv.shouldBe(visible);
    }

    private void SwipeAction() {
        atSwipeHelper.DownSwipe1();
        atSwipeHelper.DownSwipe2();
        atSwipeHelper.DownSwipe2();
        atSwipeHelper.swipeToArchive();
    }
}
