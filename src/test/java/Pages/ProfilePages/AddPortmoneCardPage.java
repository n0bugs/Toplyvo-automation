package Pages.ProfilePages;

import Helpers.SwipeHelper;
import UserModel.PortmoneUser;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class AddPortmoneCardPage {
    private final SelenideElement
            accountBtn = $(By.id("account_tab")),
            wearemarket = $(By.id("btn_ok")),
            myCardsTV = $(By.id("myCardsTV")),
            btn_ok = $(By.id("btn_ok")),
            addCardTV = $(By.id("addCardTV")),
            cardInputLocator  = $(By.id("etxt_input_widget")),
            validityDateLocator = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")),
            cvvLocator = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")),
            btnSave = $(By.id("btn_preauth_card")),
            swipe = $(By.id("swipe"));


    SwipeHelper atSwipeHelper = new SwipeHelper();
    PortmoneUser atPortmoneUser = new PortmoneUser("4444333322221111", "1124", "123");

    public void AddPortmoneCardAction() {
        accountBtn.shouldBe(visible).click();
        wearemarket.shouldBe(visible).click();
        myCardsTV.shouldBe(visible).click();
        atSwipeHelper.deletePortmoneCardSwiper();
        btn_ok.shouldBe(visible).click();
        addCardTV.shouldBe(visible).click();
        cardInputLocator.shouldBe(visible).setValue(atPortmoneUser.getCardNumberPortmone());
        validityDateLocator.shouldBe(visible).setValue(atPortmoneUser.getExpiredDatePortmone());
        cvvLocator.shouldBe(visible).setValue(atPortmoneUser.getCardCvvPortmone());
        btnSave.shouldBe(visible).click();
        swipe.shouldBe(visible);
    }
}
