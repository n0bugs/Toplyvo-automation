package Pages.TicketPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MoveTicketToArchive extends AndroidSetUp {

    private final SelenideElement FindTicket = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/" +
            "android.widget.TextView"));

    private final SelenideElement TapMoveArchive = $(By.id("ticket_status_tv"));

    private final SelenideElement ConfirmToMoveTicket = $(By.id("tv_ticket_used_title"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void AddTicketToStorage() {
        try {
            atSwipeHelper.DownSwipe1();
            atSwipeHelper.DownSwipe2();
            FindTicket.shouldBe(Condition.visible).click();
            TapMoveArchive.shouldBe(Condition.visible).click();
            ConfirmToMoveTicket.shouldHave(Condition.text("Перемещен"));
        } catch (Exception e) {
            System.out.println("Талоны не подгрузились");
        }
    }
}
