package Pages.BuyFuelPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class BuyFuelPage {

    public SelenideElement btnContinueAfterBuy = $(By.id("continue_tv"));

    public SelenideElement personalMoney = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]/android.widget.TextView"));

    public SelenideElement personalMoney2 = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[3]/android.widget.TextView"));

    public SelenideElement confirmPurchase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

    public SelenideElement verifyPurchase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView"));

    public SelenideElement confirmPurchase2 = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]\n"));

    public SelenideElement checkMessage = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout\n"));

    public SelenideElement payTickets = $(By.id("tv_pay_tickets"));

    public void BuyFueel() {
        personalMoney.click();
        confirmPurchase.click();
        verifyPurchase.shouldBe(Condition.visible).click();
        btnContinueAfterBuy.click();

    }

    public void BuyFueelNegative() {
        personalMoney.click();
        confirmPurchase2.click();
        checkMessage.shouldBe(Condition.visible);


    }

    public void payTickets() {
        personalMoney.click();
        payTickets.click();
        btnContinueAfterBuy.click();

    }

    public void payTickets2() throws InterruptedException {
        Thread.sleep(1000);
        personalMoney2.click();
        payTickets.click();
        btnContinueAfterBuy.click();

    }
}




