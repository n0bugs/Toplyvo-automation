package Pages.ProfilePages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class foundationPage {
    private final SelenideElement servicesBtn = $(By.id("service_tab"));

    private final SelenideElement helpFoundBtn = $(By.id("rlHelp"));

    private final SelenideElement onehundretPercent = $(By.id("perc_100"));

    private final SelenideElement donationSwitcher = $(By.id("donationSwitcher"));


    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void checkTabletochki() {
        try {
            servicesBtn.shouldBe(visible).click();
            helpFoundBtn.shouldBe(visible).click();
            atSwipeHelper.DownSwipe();
            atSwipeHelper.DownSwipe();
            onehundretPercent.click();
            donationSwitcher.shouldBe(visible).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

