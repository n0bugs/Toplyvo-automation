package Pages.BuyFuelPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ByFuelSkeleton {
    public SelenideElement btnBuyFuel = $(By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView"));

    public SelenideElement btnContinue = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));


    public SelenideElement sunoilID = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Sunoil\"]/android.widget.TextView"));

    public SelenideElement MottiSID = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Motto\"]/android.widget.TextView"));

    public SelenideElement oviS = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Ovis\"]/android.widget.TextView"));

    public SelenideElement btnOvis = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.LinearLayout"));

    public SelenideElement plusBtn = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/" +
            "android.widget.ImageView"));

    public SelenideElement btnBuyFuel2 = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.TextView"));

    public SelenideElement netTabletochci = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    public SelenideElement choosePayment = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView\n"));


    public SelenideElement netTabletochciPositive = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]"));

    public SelenideElement confirmPurchase = $(By.id("ua.fuel.debug:id/tv_pay_tickets"));




    public void BuyFuel() {
        btnBuyFuel.shouldBe(Condition.visible).click();
        btnContinue.click();
        MottiSID.click();
        oviS.click();
        btnOvis.click();
        plusBtn.click();
        btnBuyFuel2.click();
        netTabletochci.shouldBe(visible).click();
        choosePayment.click();
    }

    public void BuyFuelTablPositive() {
        btnBuyFuel.shouldBe(Condition.visible).click();
        btnContinue.click();
        MottiSID.click();
        oviS.click();
        btnOvis.click();
        plusBtn.click();
        btnBuyFuel2.click();
        netTabletochciPositive.shouldBe(visible).click();
        choosePayment.click();
    }
}
