package Pages.AuthorizationPages;

import Helpers.RandomPhoneNumber;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends AndroidSetUp {

    public SelenideElement skipButtonclick = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[2]"));

    public SelenideElement Phone = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));

    public SelenideElement Contbut = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/" +
            "android.widget.LinearLayout/android.widget.TextView[3]"));

    public SelenideElement access_sms_code = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
            "android.widget.Button[2]"));

    public SelenideElement Contbut2 = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[6]"));

    public SelenideElement Authbut = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));

    public SelenideElement negativeTitle = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]"));

    public SelenideElement server_Disabled = $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout"));

    RandomPhoneNumber atRandomPhoneNumber = new RandomPhoneNumber();

    public void loginVariables1() {
        try {
            skipButtonclick.shouldBe(Condition.visible).click();
            Phone.setValue("955132788");
            Contbut.shouldBe(Condition.visible).click();
            Authbut.setValue("111111");
        } catch (Exception e) {
            server_Disabled.shouldBe(Condition.visible);
        }
    }

    public void loginVariables3() {

        skipButtonclick.shouldBe(Condition.visible).click();
        Phone.setValue("992534912");
        Contbut.shouldBe(Condition.visible).click();
        access_sms_code.shouldBe(Condition.visible).click();
    }

    public void loginVariables2() {
        try {
            skipButtonclick.shouldBe(Condition.visible).click();
            Phone.setValue("955132788");
            Contbut.shouldBe(Condition.visible).click();
            Authbut.setValue("000000");
            negativeTitle.shouldBe(Condition.visible);
        } catch (Exception e) {
            server_Disabled.shouldBe(Condition.visible);
        }
    }

    public void loginVariables4() {
            skipButtonclick.shouldBe(Condition.visible).click();
            Phone.setValue(atRandomPhoneNumber.main2());
            Contbut.shouldBe(Condition.visible).click();
            Authbut.setValue("111111");
            driver.navigate().back();
            Contbut2.shouldBe(Condition.visible).click();
    }
}
