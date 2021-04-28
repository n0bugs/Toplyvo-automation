package Pages.TicketPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MoveTicketToActive extends AndroidSetUp {

    private SelenideElement btn_buy_fuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.TextView"));

    private SelenideElement btn_arhive = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Архив\"]/android.widget.LinearLayout/android.widget.TextView\n"));

    private SelenideElement talon_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/" +
            "android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout" +
            "/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout"));

    private SelenideElement btn_add_to_active = $(By.id("ticket_status_tv"));

    private SelenideElement confirm_to_ticket_add_archivee = $(By.id ("title_left_iv"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void add_ticket_to_active() throws InterruptedException {
//            atSwipeHelper.DownSwipe();
            btn_arhive.shouldBe(Condition.visible).click();
        Thread.sleep(2000);
        talon_tap.shouldBe(Condition.visible).click();
            btn_add_to_active.shouldBe(Condition.visible).click();
//            confirm_to_ticket_add_archivee.shouldNotBe(Condition.visible);
//                    shouldHave(Condition.text("Перемещен"));
    }
}