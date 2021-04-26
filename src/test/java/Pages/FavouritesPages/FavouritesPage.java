package Pages.FavouritesPages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FavouritesPage extends AndroidSetUp {

    private SelenideElement click_buy_fuels = $(By.id("btn_buy_tickets"));

    public SelenideElement Fuel98 = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"98\"]/android.widget.TextView"));

    public SelenideElement dtfuel = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"ДТ+\"]/android.widget.TextView"));

    public SelenideElement gas = $(By.xpath("//android.widget.LinearLayout[@content-desc=\"Газ\"]/android.widget.TextView"));

    private SelenideElement ovis = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView[3]"));

    private SelenideElement glus = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView[3]"));

    private SelenideElement backBut = $(By.id("title_left_iv"));

    private SelenideElement favor = $(By.id("img_arrow_down"));

    private SelenideElement firstdel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));

    private SelenideElement seconddel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]"));

    private SelenideElement clickFuel = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout"));

    private SelenideElement  plus = $(By.id("img_plus"));

    private SelenideElement click_buy_fuels2 = $(By.id("btn_buy_tickets"));

    private SelenideElement  canceltablet = $(By.id("btn_cancel"));

    private SelenideElement choosepayment = $(By.id("l_select_payment_type"));

    public void FavouritesPageAction() throws InterruptedException {
        click_buy_fuels.shouldBe(visible).click();
        Fuel98.shouldBe(visible).click();
        dtfuel.shouldBe(visible).click();
        gas.shouldBe(visible).click();
        ovis.shouldBe(visible).click();
        glus.shouldBe(visible).click();
        backBut.shouldBe(visible).click();
        favor.shouldBe(visible).click();
        firstdel.shouldBe(visible).click();
        seconddel.shouldBe(visible).click();
    }

    public void AddTwoTicket() {
//        click_buy_fuels.shouldBe(visible).click();
//        click_scroll.shouldBe(visible).click();
//        click_scroll2.shouldBe(visible).click();
//        click_gas.shouldBe(visible).click();
//        add_fav_ovis_gas.shouldBe(visible).click();
//        shoud_visible_add_to_favourite.shouldBe(visible);
//        back_to_ticket_page.shouldBe(visible).click();
//        shoud_visible_show_visible_fuel.shouldBe(visible);
//        click_buy_fuels.shouldBe(visible).click();
//        add_fav_okko_a92.shouldBe(visible).click();
//        back_to_ticket_page.shouldBe(visible).click();
//        navbar_click.shouldBe(visible).click();
    }

    public void GoToPayment() throws InterruptedException {
        click_buy_fuels.shouldBe(visible).click();
        Fuel98.shouldBe(visible).click();
        dtfuel.shouldBe(visible).click();
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