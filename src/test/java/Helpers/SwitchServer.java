package Helpers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.actions;

public class SwitchServer extends AndroidSetUp {
    public SelenideElement skipButtonclick = $(By.id("ua.fuel.debug:id/skip_tv"));

    public SelenideElement btn_server = $(By.id("ua.fuel.debug:id/startTestFragmentButton"));

    public SelenideElement chose_server_stage = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]"));

    public SelenideElement chose_server_prod = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[10]"));

    public SelenideElement confirm_to_change_server = $(By.id("ua.fuel.debug:id/phone_et"));


    public void change_sever_method() {
        try {
            skipButtonclick.shouldBe(Condition.visible).click();
            btn_server.shouldBe(Condition.visible).click();

            SwipeHelper atSwipeHelper = new SwipeHelper();
            atSwipeHelper.DownSwipe();

            chose_server_prod.shouldBe(Condition.visible).click();

        } catch (Exception e){
            confirm_to_change_server.shouldBe(Condition.visible);
        }


    }
}
