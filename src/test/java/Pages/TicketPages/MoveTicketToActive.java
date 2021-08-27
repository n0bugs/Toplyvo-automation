package Pages.TicketPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MoveTicketToActive extends AndroidSetUp {

    private final SelenideElement btn_arhive = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Архив\"]/" +
            "android.widget.LinearLayout/android.widget.TextView\n"));

    private final SelenideElement talon_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout"));

    private final SelenideElement btn_add_to_active = $(By.id("ticket_status_tv"));

    private final SelenideElement confirmToTicketAddActive = $(By.id("qr_code_iv"));

    private final SelenideElement title_left_iv = $(By.id("title_left_iv"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void AddTicketToActive() {
        try {
            btn_arhive.shouldBe(visible).click();
            talon_tap.shouldBe(visible).click();
            btn_add_to_active.shouldBe(visible).click();
            confirmToTicketAddActive.shouldBe(visible);
            title_left_iv.shouldBe(visible).click();
            atSwipeHelper.refreshArhive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}