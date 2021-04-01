package Pages.TicketPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MoveTicketToActive extends AndroidSetUp {

    public SelenideElement btn_buy_fuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.TextView"));

    public SelenideElement btn_arhive = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Архив\"]/android.widget.LinearLayout/android.widget.TextView"));

    public SelenideElement talon_tap = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/" +
            "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.RelativeLayout"));

    public SelenideElement btn_add_to_active = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/" +
            "android.widget.RelativeLayout/android.widget.TextView"));

    public SelenideElement confirm_to_ticket_add_archivee = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView"));

    public void add_ticket_to_active() {
        try{
            btn_buy_fuel.shouldBe(Condition.visible);
            btn_arhive.shouldBe(Condition.visible).click();
            talon_tap.shouldBe(Condition.visible).click();
            btn_add_to_active.shouldBe(Condition.visible).click();
            confirm_to_ticket_add_archivee.shouldNotBe(Condition.visible);
//                    shouldHave(Condition.text("Перемещен"));
        }catch (Exception e){
            System.out.println("Что-то не так!... Талон не добавлен в активные");
        }
    }
}