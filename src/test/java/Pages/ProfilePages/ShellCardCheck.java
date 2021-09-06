package Pages.ProfilePages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import java.util.Locale;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ShellCardCheck {

    private final SelenideElement account = $(By.id("account_tab"));

    private final SelenideElement wearemarket = $(By.id("btn_ok"));

    private final SelenideElement ShellCardBut = $(By.id("shellBlock"));

    private final SelenideElement Name = $(By.id("nameInput"));

    private final SelenideElement Surname = $(By.id("surnameInput"));

    private final SelenideElement birthDate = $(By.id("birthDateEditText"));

    private final SelenideElement year = $(By.id("android:id/date_picker_header_year"));

    private final SelenideElement Year1998 = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/" +
            "android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/" +
            "android.widget.ListView/android.widget.TextView[4]"));

    private final SelenideElement okCalendarbut = $(By.id("android:id/button1"));

    private final SelenideElement getCard = $(By.id("getCardTV"));

    private final SelenideElement showCreateCard = $(By.id("cardImage"));

    SwipeHelper atSwipeHelper = new SwipeHelper();
    Faker atFaker = new Faker(new Locale("uk", "UA"));

    public void ShellCard() throws InterruptedException {
        account.shouldBe(visible).click();
        wearemarket.shouldBe(visible).click();
        ShellCardBut.shouldBe(visible).click();
        Surname.shouldBe(visible).sendKeys(atFaker.name().lastName());
        Name.shouldBe(visible).sendKeys(atFaker.name().firstName());
        birthDate.shouldBe(visible).click();
        year.shouldBe(visible).click();
        Thread.sleep(3000);
        atSwipeHelper.UpSwipe1();
        atSwipeHelper.UpSwipe1();
        atSwipeHelper.UpSwipe1();
        Year1998.shouldBe(visible).click();
        okCalendarbut.shouldBe(visible).click();
        getCard.shouldBe(visible).click();
        Thread.sleep(900);
        atSwipeHelper.refreshSwipe();
        Thread.sleep(3000);
        ShellCardBut.shouldBe(visible).click();
        showCreateCard.shouldBe(visible);
    }
}


