package Pages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class DeleteBankCardPages extends AndroidSetUp {

    public SelenideElement tap_profile = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[5]"));

    public SelenideElement marketplase_modal = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[4]"));

    public SelenideElement profile_bank_card = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/" +
            "android.widget.LinearLayout/android.widget.TextView[2]"));


    public SelenideElement confirm_delete_card = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]"));

    SwipeHelper atSwiperHelper = new SwipeHelper();

    public void delete_bank_card() {
        try{
            tap_profile.shouldBe(Condition.visible).click();
            marketplase_modal.shouldBe(Condition.visible).click();
            profile_bank_card.shouldBe(Condition.visible).click();
            atSwiperHelper.SwipeDeleteCard();
            confirm_delete_card.shouldBe(Condition.visible).click();

//            profile_btn_add_card.shouldBe(Condition.visible).click();
//            .shouldHave(Condition.text("Перемещен"));
        }catch (Exception e){
            System.out.println("Не удалось удалить карту");
        }
    }

}
