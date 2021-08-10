package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BuyFromMapPage {

    private final SelenideElement mapMenu = $(By.id("maps_tab"));

    private final SelenideElement shell = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]"));

    private final SelenideElement firstShell = $(By.xpath("//android.view.View[@content-desc=\"Карта Google\"]/android.view.View[2]"));

    private final SelenideElement clickShellType = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout"));

    private final SelenideElement imgPlus = $(By.id("img_plus"));

    private final SelenideElement buyTicketsButton = $(By.id("btn_buy_tickets"));

    private final SelenideElement tabletochkiSkip = $(By.id("btn_cancel"));

    private final SelenideElement tabletochkiAccept = $(By.id("btn_ok"));

    private final SelenideElement choosePayment = $(By.id("arrow_down_iv"));

    public void BuyFuelMap() {
        mapMenu.shouldBe(visible).click();
        shell.shouldBe(visible).click();
        firstShell.shouldBe(visible).click();
        clickShellType.shouldBe(visible).click();
        imgPlus.shouldBe(visible).click();
        buyTicketsButton.shouldBe(visible).click();
        if (tabletochkiSkip != tabletochkiSkip.shouldBe(not(visible))) {
            tabletochkiSkip.click();
        }
        choosePayment.shouldBe(visible).click();
    }
}