package Pages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MoveTicketToArchive extends AndroidSetUp {

    public SelenideElement btn_buy_fuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.TextView"));

    public SelenideElement ticket_to_archive = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView"));

    public SelenideElement tap_to_add_archive = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.TextView"));

    public SelenideElement confirm_to_ticket_add_archive = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView"));

    SwipeHelper atSwiperHelper = new SwipeHelper();

    public void add_ticket_to_starage() {
        try{
        btn_buy_fuel.shouldBe(Condition.visible);
        atSwiperHelper.DownSwipe();
        ticket_to_archive.shouldBe(Condition.visible).click();
        tap_to_add_archive.shouldBe(Condition.visible).click();
        confirm_to_ticket_add_archive.shouldHave(Condition.text("Перемещен"));
        }catch (Exception e){
            System.out.println("Нету активных талонов");
        }
    }
}
