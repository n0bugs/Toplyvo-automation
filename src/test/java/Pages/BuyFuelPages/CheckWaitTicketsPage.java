package Pages.BuyFuelPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckWaitTicketsPage {

    private SelenideElement WaitBut = $(By.id("l_expect_to_receive"));

    private SelenideElement firstElem = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView"));

    private SelenideElement back = $(By.id("title_left_iv"));

    SwipeHelper atSwiperHelper = new SwipeHelper();

    public void CheckMetod() throws InterruptedException {
        Thread.sleep(9000);
        atSwiperHelper.refreshSwipe();
        Thread.sleep(10000);
        WaitBut.shouldBe(Condition.visible).click();
        firstElem.shouldBe(Condition.visible);
        back.shouldBe(Condition.visible).click();
        WaitBut.shouldBe(Condition.visible);
    }
}
