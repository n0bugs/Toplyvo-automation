package Pages.VisualTestPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AccountPage {
    private final SelenideElement account_tabElement =$(By.id("account_tab"));
    private final SelenideElement wearemarket = $(By.id("btn_ok"));
    private final SelenideElement llMyProfileElement = $(By.id("llMyProfile"));
    private final SelenideElement llBusinessProfileElement = $(By.id("llBusinessProfile"));
    private final SelenideElement llCertificateProfileElement = $(By.id("llCertificateProfile"));
    private final SelenideElement replenish_balanceElement = $(By.id("replenish_balance"));
    private final SelenideElement tv_withdrawElement = $(By.id("tv_withdraw"));
    private final SelenideElement notificationsTVElement = $(By.id("notificationsTV"));
    private final SelenideElement myCardsTVElement = $(By.id("myCardsTV"));
    private final SelenideElement shellBlockElement = $(By.id("shellBlock"));
    private final SelenideElement title_left_ivElement = $(By.id("title_left_iv"));
    private final SelenideElement phone_textElement = $(By.id("phone_text"));

    public void VisualStepTestAccount() {
        account_tabElement.shouldBe(visible).click();
        wearemarket.shouldBe(visible).click();
        llMyProfileElement.shouldBe(visible);
        llBusinessProfileElement.shouldBe(visible);
        llCertificateProfileElement.shouldBe(visible);
        replenish_balanceElement.shouldNot(enabled);
        tv_withdrawElement.shouldBe(visible).shouldBe(enabled);
        notificationsTVElement.shouldBe(visible).shouldHave(text("Уведомления"));
        myCardsTVElement.shouldBe(visible).shouldHave(text("Мои карты"));
        shellBlockElement.shouldBe(visible);
        title_left_ivElement.shouldBe(visible).shouldBe(enabled);
        phone_textElement.shouldBe(visible);
    }
}
