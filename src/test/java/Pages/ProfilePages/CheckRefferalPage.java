package Pages.ProfilePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CheckRefferalPage {

    public SelenideElement bonusesButton = $(By.id("bonuses_tab"));

    public SelenideElement check_spend_bonus = $(By.id("current_balance_tv"));

    public SelenideElement skipMarketPlase = $(By.id("btn_ok"));

    public SelenideElement continuebtn = $(By.id("continue_tv"));

    public SelenideElement ref_person_btn = $(By.id("referals_tv"));

    public SelenideElement check_invite_people = $(By.id("ref_count_tv"));


    public void checkrefpesonal() {
        bonusesButton.shouldBe(visible).click();
        if (skipMarketPlase == skipMarketPlase.shouldBe(visible)) {
            skipMarketPlase.click();
        }
        continuebtn.shouldBe(visible).click();
        check_spend_bonus.shouldHave(text("290"));
        ref_person_btn.shouldBe(visible).click();
        check_invite_people.shouldHave(text("5"));
    }
}
