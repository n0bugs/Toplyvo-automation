package Pages.BuyFuelPages;

import UserModel.OKKOUser;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BuyFuelNewFLowSkeleton {

    private final SelenideElement buyFuelButton = $(By.id("btn_buy_tickets"));

    private final SelenideElement FirstFuelButton = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));

    private final SelenideElement imgPlus = $(By.id("img_plus"));

    private final SelenideElement buyTicketsButton = $(By.id("btn_buy_tickets"));

    private final SelenideElement tabletochkiSkip = $(By.id("btn_cancel"));

    private final SelenideElement choosePayment = $(By.id("arrow_down_iv"));

    private final SelenideElement OKKOField = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]"));

    private final SelenideElement valueInput = $(By.id("valueInput"));

    private final SelenideElement buyFuelBtn = $(By.id("buyFuelBtn"));

    private final SelenideElement nameET = $(By.id("nameET"));

    private final SelenideElement surnameET = $(By.id("surnameET"));

    private final SelenideElement birthET2 = $(By.id("birthET2"));

    private final SelenideElement BirthInput = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText"));

    private final SelenideElement clickConfirmBirth = $(By.id("android:id/button1"));

    private final SelenideElement btnBuyOkko = $(By.id("btn_buy_okko"));

    private final SelenideElement confirmToRegister = $(By.id("title_tv"));

    public void buyFuelSkeletonMethod() {
        buyFuelButton.shouldBe(visible).click();
        FirstFuelButton.shouldBe(visible).click();
        imgPlus.shouldBe(visible).click();
        buyTicketsButton.click();
        if (tabletochkiSkip == tabletochkiSkip.shouldBe(visible)) {
            tabletochkiSkip.click();
        }
        choosePayment.shouldBe(visible).click();
    }

    public void buyFuelSkeletonMethodPositive() {
        buyFuelButton.shouldBe(visible).click();
        FirstFuelButton.shouldBe(visible).click();
        imgPlus.shouldBe(visible).click();
        buyTicketsButton.shouldBe(visible).click();
        if (tabletochkiSkip == tabletochkiSkip.shouldBe(visible)) {
            tabletochkiSkip.click();
        }
        choosePayment.shouldBe(visible).click();
    }

    public void buyFuelSkeletonMethodNEWuser() {
        buyFuelButton.click();
        FirstFuelButton.click();
        imgPlus.click();
        buyTicketsButton.click();
        choosePayment.click();
    }

    OKKOUser okkoUser = new OKKOUser("Ivan", "Crash", "1", "1998");
    public void BuyOKKOMethod() {
        try {
            buyFuelButton.shouldBe(visible).click();
            OKKOField.shouldBe(visible).click();
            valueInput.shouldBe(visible).sendKeys(okkoUser.getValueLiters());
            buyFuelBtn.shouldBe(visible).click();
            nameET.shouldBe(visible).sendKeys(okkoUser.getName());
            surnameET.shouldBe(visible).sendKeys(okkoUser.getSurname());
            birthET2.shouldBe(visible).click();
            BirthInput.shouldBe(visible).clear();
            BirthInput.shouldBe(visible).sendKeys(okkoUser.getBirthDate());
            clickConfirmBirth.shouldBe(visible).click();
            btnBuyOkko.shouldBe(visible).click();
            confirmToRegister.shouldBe(visible).shouldHave(text("Покупка топлива"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
