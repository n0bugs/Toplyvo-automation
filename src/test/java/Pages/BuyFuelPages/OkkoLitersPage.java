package Pages.BuyFuelPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OkkoLitersPage {

    private final SelenideElement firstOKKO = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]"));

    private final SelenideElement checkQR = $(By.id("qrCodeView"));

    private final SelenideElement checkText = $(By.id("tvLitersDescription"));

    private final SelenideElement fuelLogo = $(By.id("fuelTypeLogo"));

    private final SelenideElement networkLogo = $(By.id("networkLogo"));

    private final SelenideElement fuelAmountLabel = $(By.id("fuelAmountLabel"));

    private final SelenideElement backbut = $(By.id("title_left_iv"));

    private final SelenideElement qrNumberView = $(By.id("qrNumberView"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void CheckLiter() {
        try {
            atSwipeHelper.DownSwipe1();
            firstOKKO.shouldBe(visible).click();
            checkQR.shouldBe(visible);
            checkText.shouldHave(text("1. Перед заправкой покажите, пожалуйста, QR-код кассиру и укажите количество" +
                    " литров на которое хотите заправиться в пределах доступного баланса" +
                    " 2. Введите, пожалуйста, ПИН-код вашей карты Fishka в терминале." +
                    " Забыли ПИН-код - легко восстановить/создать его на кассе ОККО"));
            fuelLogo.shouldBe(visible);
            networkLogo.shouldBe(visible);
            qrNumberView.shouldBe(visible);
            fuelAmountLabel.shouldBe(visible);
            backbut.shouldBe(visible).click();
            firstOKKO.shouldBe(visible);
        }catch (Exception e){
            System.out.println("Не удалось проверить литры ОККО");
        }
    }
}
