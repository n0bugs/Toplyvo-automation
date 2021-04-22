package Pages.BuyFuelPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckWaitTicketsPage {

    public SelenideElement confirmPurchase = $(By.id("ua.fuel.debug:id/tv_pay_tickets"));

    public void CheckMetod() {
        confirmPurchase.shouldBe(Condition.visible).click();

    }
}
