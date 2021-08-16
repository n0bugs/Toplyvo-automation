package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckWaitTicketsPage {

    private final SelenideElement WaitBut = $(By.id("l_expect_to_receive"));

    private final SelenideElement checkWaitTalon = $(By.id("title_tv"));

    private final SelenideElement back = $(By.id("title_left_iv"));


    public void CheckMetod() {
        try {
            WaitBut.shouldBe(visible).click();
            checkWaitTalon.shouldBe(visible);
            back.shouldBe(visible).click();
            WaitBut.shouldBe(visible);
        } catch (Exception e) {
            System.out.println("Не удалось проверить ожидания получение талонов");
        }


    }
}
