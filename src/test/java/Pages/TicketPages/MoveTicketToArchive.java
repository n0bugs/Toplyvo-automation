package Pages.TicketPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MoveTicketToArchive extends AndroidSetUp {

    private SelenideElement btn_buy_fuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.TextView"));

    private SelenideElement btn_arhive = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Архив\"]/android.widget.LinearLayout/android.widget.TextView\n"));

    private SelenideElement ticket_to_archive = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout" +
            "/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));

    private SelenideElement tap_to_add_archive = $(By.id("ticket_status_tv"));

    private SelenideElement confirm_to_ticket_add_archive = $(By.id("tv_ticket_used_title"));

    SwipeHelper atSwiperHelper = new SwipeHelper();

    public void add_ticket_to_starage() throws InterruptedException {
        Thread.sleep(3000);

        atSwiperHelper.refreshSwipe();
        ticket_to_archive.shouldBe(Condition.visible).click();
        tap_to_add_archive.shouldBe(Condition.visible).click();
        confirm_to_ticket_add_archive.shouldBe(Condition.visible);
    }
}
