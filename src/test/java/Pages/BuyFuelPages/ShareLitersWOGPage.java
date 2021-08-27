package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ShareLitersWOGPage {

    private final SelenideElement tapToWog = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout" +
            "/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));

    private final SelenideElement verifyWog = $(By.id("tvLitersDescription"));

    private final SelenideElement tapToShare = $(By.id("title_right_iv"));

    private final SelenideElement valueInput = $(By.id("valueInput"));

    private final SelenideElement continueTv = $(By.id("continue_tv"));

    private final SelenideElement findUser = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/" +
            "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));

    private final SelenideElement commentET = $(By.id("commentET"));

    private final SelenideElement continueTV = $(By.id("continueTV"));

    private final SelenideElement shareTicketTV = $(By.id("shareTicketTV"));

    public void ShareWOGAction() {
        tapToWog.shouldBe(visible).click();
        verifyWog.shouldBe(visible).shouldHave(text("Покажите QR код кассиру. " +
                "Заправка пойдет до полного бака, либо на сколько хватит литров на балансе. " +
                "Если топливо не войдет в бак, оно вернется на баланс."));
        tapToShare.shouldBe(visible).click();
        valueInput.shouldBe(visible).sendKeys("1");
        continueTv.shouldBe(visible).click();
        findUser.shouldBe(visible).click();
        String comment = "1234Test\uD83D\uDCA9";
        commentET.shouldBe(visible).sendKeys(comment);
        shareTicketTV.shouldBe(visible).click();
        continueTV.shouldBe(visible).click();
        continueTV.shouldBe(visible).click();

    }
}
