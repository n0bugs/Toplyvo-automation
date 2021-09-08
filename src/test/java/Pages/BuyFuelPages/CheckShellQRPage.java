package Pages.BuyFuelPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.Authorization.LoginInter;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CheckShellQRPage {
    private final SelenideElement FindTicket = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/" +
            "android.widget.TextView"));

    private final SelenideElement loyaltyTextTV = $(By.id("loyaltyTextTV"));

    private final SelenideElement loyaltyBlock = $(By.id("loyaltyBlock"));

    private final SelenideElement cardImage = $(By.id("cardImage"));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void checkShellQRAction() {
        try {
            swipeAction();
            FindTicket.shouldBe(visible).click();
            loyaltyTextTV.shouldBe(visible);
            loyaltyBlock.shouldBe(visible).click();
            cardImage.shouldBe(visible);
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    private void swipeAction() {
        atSwipeHelper.DownSwipe1();
        atSwipeHelper.DownSwipe2();
        atSwipeHelper.DownSwipe2();
    }
}
