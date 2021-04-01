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

    public SelenideElement plusBtn = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/" +
            "android.widget.ImageView"));

    public SelenideElement btnBuyFuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.TextView"));

    public SelenideElement choosePayment = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"));

    public SelenideElement netTabletochci = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.LinearLayout/android.widget.TextView[2]"));

    public SelenideElement btnContinueAfterDiesel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));

    public void BuyFuelMap() {
        mapMenu.click();
        glusco.click();
        firstDiesel.click();
        btnContinueAfterDiesel.shouldBe(visible).click();
        plusBtn.click();
        btnBuyFuel.click();
        netTabletochci.shouldBe(visible).click();
        choosePayment.click();
    }
}