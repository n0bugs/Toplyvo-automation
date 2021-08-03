package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BuyFuelNewFLowSkeleton {
    private SelenideElement buyFuelButton = $(By.id("btn_buy_tickets"));

    private SelenideElement FirstFuelButton = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]"));

    private SelenideElement imgPlus = $(By.id("img_plus"));

    private SelenideElement buyTicketsButton = $(By.id("btn_buy_tickets"));

    private SelenideElement tabletochkiSkip = $(By.id("btn_cancel"));

    private SelenideElement tabletochkiAccept = $(By.id("btn_ok"));

    private SelenideElement choosePayment = $(By.id("arrow_down_iv"));

    public void buyFuelSkeletonMethod() {
        buyFuelButton.click();
        FirstFuelButton.click();
        imgPlus.click();
        buyTicketsButton.click();
        tabletochkiSkip.click();
        choosePayment.click();
    }
    public void buyFuelSkeletonMethodPositive() {
        buyFuelButton.click();
        FirstFuelButton.click();
        imgPlus.click();
        buyTicketsButton.click();
        tabletochkiAccept.click();
        choosePayment.click();
    }
    public void buyFuelSkeletonMethodNEWuser() {
        buyFuelButton.click();
        FirstFuelButton.click();
        imgPlus.click();
        buyTicketsButton.click();
        choosePayment.click();
    }
}
