package Pages.FavouritesPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FavouritesPage extends AndroidSetUp {

    public SelenideElement click_buy_fuels = $(By.id("btn_buy_tickets"));

    public SelenideElement click_scroll = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"98\"]/android.widget.TextView"));

    public SelenideElement click_scroll2 = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"ДТ+\"]/android.widget.TextView"));

    public SelenideElement click_gas = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Газ\"]/android.widget.TextView"));

    public SelenideElement add_fav_ovis_gas = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView[3]"));

    public SelenideElement shoud_visible_add_to_favourite = $(By.id("snackbar_text"));

    public SelenideElement back_to_ticket_page = $(By.id("title_left_iv"));

    public SelenideElement shoud_visible_show_visible_fuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout"));

    public SelenideElement add_fav_okko_a92 = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/" +
            "android.widget.ImageView[3]"));

    public SelenideElement navbar_click = $(By.id("rl_favorites"));

    public SelenideElement delete_fuel1 = $(By.id("img_favorite_active"));

    public SelenideElement arrow_fuel_navbar = $(By.id("img_arrow_down"));

    public SelenideElement delete_first_fuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));

    public SelenideElement delete_second_fuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));

    public SelenideElement tap_for_payment = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout"));

    public SelenideElement check_for_payment_screen = $(By.id("title_tv"));


    public void FavouritesPageAction() throws InterruptedException {
        click_buy_fuels.shouldBe(visible).click();
        click_scroll.shouldBe(visible).click();
        click_scroll2.shouldBe(visible).click();
        click_gas.shouldBe(visible).click();
        add_fav_ovis_gas.shouldBe(visible).click();
        shoud_visible_add_to_favourite.shouldBe(visible);
        back_to_ticket_page.shouldBe(visible).click();
        shoud_visible_show_visible_fuel.shouldBe(visible);

        delete_fuel1.shouldBe(visible).click();
        Thread.sleep(4000);
    }

    public void AddTwoTicket() {
        click_buy_fuels.shouldBe(visible).click();
        click_scroll.shouldBe(visible).click();
        click_scroll2.shouldBe(visible).click();
        click_gas.shouldBe(visible).click();
        add_fav_ovis_gas.shouldBe(visible).click();
        shoud_visible_add_to_favourite.shouldBe(visible);
        back_to_ticket_page.shouldBe(visible).click();
        shoud_visible_show_visible_fuel.shouldBe(visible);

        click_buy_fuels.shouldBe(visible).click();
        add_fav_okko_a92.shouldBe(visible).click();
        back_to_ticket_page.shouldBe(visible).click();
        navbar_click.shouldBe(visible).click();
    }

    public void DeleteAtFavourite() throws InterruptedException {
        arrow_fuel_navbar.shouldBe(visible).click();
        delete_first_fuel.shouldBe(visible).click();
        Thread.sleep(4000);
        delete_fuel1.shouldBe(visible).click();
        Thread.sleep(5000);

    }

    public void GoToPayment() throws InterruptedException {
        click_buy_fuels.shouldBe(visible).click();
        click_scroll.shouldBe(visible).click();
        click_scroll2.shouldBe(visible).click();
        click_gas.shouldBe(visible).click();
        add_fav_ovis_gas.shouldBe(visible).click();
        shoud_visible_add_to_favourite.shouldBe(visible);
        back_to_ticket_page.shouldBe(visible).click();
        shoud_visible_show_visible_fuel.shouldBe(visible);
        tap_for_payment.shouldBe(visible).click();
        check_for_payment_screen.shouldBe(visible);
        back_to_ticket_page.shouldBe(visible).click();
        delete_fuel1.shouldBe(visible).click();
        Thread.sleep(5000);
    }
}
