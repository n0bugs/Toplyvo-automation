package Pages.FavouritesPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FavouritesPage {

    private final SelenideElement click_buy_fuels = $(By.id("btn_buy_tickets"));

    public SelenideElement Fuel98 = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"98\"]/android.widget.TextView"));

    public SelenideElement shellAddFavour = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]" +
            "/android.widget.ImageView[3]"));

    public SelenideElement wogAddFavour = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.RelativeLayout[2]/android.widget.ImageView[3]"));

    private final SelenideElement backBut = $(By.id("title_left_iv"));

    private final SelenideElement favor = $(By.id("img_arrow_down"));

    private final SelenideElement firstdel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));

    private final SelenideElement seconddel = $(By.id("img_favorite_active"));

    private final SelenideElement plus = $(By.id("img_plus"));

    private final SelenideElement canceltablet = $(By.id("btn_cancel"));

    private final SelenideElement choosepayment = $(By.id("l_select_payment_type"));

    private final SelenideElement selectFirstFuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout"));

    private final SelenideElement checkMethodType = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/" +
            "android.widget.TextView"));


    public void FavouritesPageAction() {
        try {
            click_buy_fuels.shouldBe(visible).click();
            Fuel98.shouldBe(visible).click();
            shellAddFavour.shouldBe(visible).click();
            wogAddFavour.shouldBe(visible).click();
            backBut.shouldBe(visible).click();
        } catch (Exception e) {
            System.out.println("Не удалось добавить в избранное");
        }
        try {
            favor.shouldBe(visible).click();
            firstdel.shouldBe(visible).click();
            seconddel.shouldBe(visible).click();
        } catch (Exception e) {
            System.out.println("Не удалось удалить или найти избранное");
        }
    }

    public void GoToPayment() {
        try {
            favor.shouldBe(visible).click();
            selectFirstFuel.shouldBe(visible).click();
            plus.shouldBe(visible).click();
            click_buy_fuels.shouldBe(visible).click();
            if (canceltablet == canceltablet.shouldBe(visible)) {
                canceltablet.click();
            }
            choosepayment.shouldBe(visible).click();
        } catch (Exception e) {
            System.out.println("Не получилось получить методы оплаты");
        }
    }

    public void DeleteAtFavourite() {
        firstdel.shouldBe(visible).click();
        seconddel.shouldBe(visible).click();
    }
}