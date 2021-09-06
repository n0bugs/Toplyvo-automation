package Pages.BuyFuelPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FilterFuelPage {
    private final SelenideElement filterActionBtn = $(By.id("filterActionBtn"));

    private final SelenideElement btn_buy_tickets = $(By.id("btn_buy_tickets"));

    private final SelenideElement dropImage = $(By.id("dropImage"));


    public void filterFuel() {
        btn_buy_tickets.shouldBe(visible).click();
        filterActionBtn.shouldBe(visible).click();
        clickAllItems();
        filterActionBtn.shouldBe(visible).click();
        dropImage.shouldBe(visible);
    }

    private void clickAllItems() {
        String xpathValueMask = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[%s]/android.view.View";
        int index = 0;
        while (true) {
            index++;
            String xpathValue = String.format(xpathValueMask, index);
            SelenideElement element = $(By.xpath(xpathValue));
            if (element.exists()) {
                element.shouldBe(visible).click();
            } else {
                break;
            }
        }
    }
}

