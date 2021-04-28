package Pages.BuyFuelPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BuyFuelSkeletonLiters {

    private SelenideElement buyFuelButton = $(By.id("btn_buy_tickets"));

    private SelenideElement a92OKKO = $(By. xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView" +
            "/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]"));

    private SelenideElement buyTicketsButton = $(By.id("tv_pay_tickets"));

    private SelenideElement inputLiters = $(By.id("valueInput"));

    private SelenideElement buyLiters = $(By.id("buyFuelBtn"));

    private SelenideElement choosePayment = $(By.id("l_select_payment_type"));

    private SelenideElement tabletochkiSkip = $(By.id("btn_cancel"));

    SwipeHelper atSwiperHelper = new SwipeHelper();

    public void buyFuelSkeletonLitersMethod() throws InterruptedException {
        buyFuelButton.click();
        Thread.sleep(3000);
        atSwiperHelper.DownSwipe();
        a92OKKO.click();
        inputLiters.sendKeys("10");
        buyLiters.click();
        tabletochkiSkip.click();
        choosePayment.click();

    }
}
