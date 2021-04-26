package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BuyFromMapPage extends AndroidSetUp {

    public SelenideElement mapMenu = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageView"));

    public SelenideElement glusco = $(By.xpath("//android.view.View[@content-desc=\"Карта Google\"]/android.view.View[7]"));

    public SelenideElement firstDiesel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
            "android.view.ViewGroup[1]/android.widget.LinearLayout"));

    public SelenideElement btnContinueAfterDiesel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));

    private SelenideElement imgPlus = $(By.id("img_plus"));

    private SelenideElement buyTicketsButton = $(By.id("btn_buy_tickets"));

    private SelenideElement tabletochkiSkip = $(By.id("btn_cancel"));

    private SelenideElement tabletochkiAccept = $(By.id("btn_ok"));

    private SelenideElement choosePayment = $(By.id("arrow_down_iv"));

    public void BuyFuelMap() {
        mapMenu.click();
        glusco.click();
        firstDiesel.click();
        imgPlus.click();
        buyTicketsButton.click();
//        tabletochkiSkip.click();
        choosePayment.click();
    }
}