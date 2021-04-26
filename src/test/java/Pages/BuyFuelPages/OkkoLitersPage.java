package Pages.BuyFuelPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OkkoLitersPage {

    public SelenideElement firstOKKO = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/a" +
            "ndroid.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]" +
            "/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public SelenideElement checkQR = $(By.id("qrCodeView"));

    public SelenideElement backbut = $(By.id("title_left_iv"));


    public void CheckLiter() throws InterruptedException {
        Thread.sleep(10000);
        atSwipeHelper.DownSwipe();
        atSwipeHelper.DownSwipe();
        firstOKKO.shouldBe(Condition.visible).click();
        checkQR.shouldBe(Condition.visible);
        backbut.shouldBe(Condition.visible).click();
        firstOKKO.shouldBe(Condition.visible);

    }
}
