package Pages.AutorizePage;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogOutPages extends AndroidSetUp{

    public SelenideElement btnAccount = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.ImageView"));

    public SelenideElement closeMarketplase = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[4]"));

    public SelenideElement btnsettings = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/" +
            "android.widget.ImageView[1]"));

    public SelenideElement logAutBtn = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.TextView[1]"));

    public void logOutmethod() {
        btnAccount.shouldBe(Condition.visible).click();
        closeMarketplase.shouldBe(visible).click();
        btnsettings.shouldBe(visible).click();
        logAutBtn.shouldBe(visible).click();
    }
}
