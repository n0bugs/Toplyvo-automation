package Pages.FavouritesPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.not;
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

    public SelenideElement gas = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Газ\"]/android.widget.TextView"));

    private final SelenideElement ovis = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.ImageView[3]\n"));

    private final SelenideElement glus = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView[3]\n"));

    private final SelenideElement backBut = $(By.id("title_left_iv"));

    private final SelenideElement favor = $(By.id("img_arrow_down"));

    private final SelenideElement firstdel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));

    private final SelenideElement seconddel = $(By.id("img_favorite_active"));

    private final SelenideElement clickFuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout"));

    private final SelenideElement plus = $(By.id("img_plus"));

    private final SelenideElement click_buy_fuels2 = $(By.id("btn_buy_tickets"));

    private final SelenideElement canceltablet = $(By.id("btn_cancel"));

    private final SelenideElement choosepayment = $(By.id("l_select_payment_type"));

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
        click_buy_fuels.shouldBe(visible).click();
        Fuel98.shouldBe(visible).click();
        shellAddFavour.shouldBe(visible).click();
        wogAddFavour.shouldBe(visible).click();
        gas.shouldBe(visible).click();
        ovis.shouldBe(visible).click();
        glus.shouldBe(visible).click();
        backBut.shouldBe(visible).click();
        favor.shouldBe(visible).click();
        clickFuel.shouldBe(visible).click();
        plus.shouldBe(visible).click();
        click_buy_fuels2.shouldBe(visible).click();
        canceltablet.shouldBe(visible).click();
        choosepayment.shouldBe(visible).click();
    }

    public void DeleteAtFavourite() {
        firstdel.shouldBe(visible).click();
        seconddel.shouldBe(visible).click();
    }
}