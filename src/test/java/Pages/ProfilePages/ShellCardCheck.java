package Pages.ProfilePages;

import Helpers.SwipeHelper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ShellCardCheck {

    private SelenideElement account = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/" +
            "android.widget.LinearLayout/android.widget.FrameLayout[5]"));

    private SelenideElement wearemarket = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[4]"));

    private SelenideElement ShellCardBut = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]" +
            "/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/" +
            "android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]"));

    private SelenideElement Name = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText"));

    private SelenideElement Surname = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText"));

    private SelenideElement birthDate = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText"));

    private SelenideElement year = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/" +
            "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]"));

        private SelenideElement Year1998 = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/" +
                "android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[2]"));

        private SelenideElement okCalendarbut = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/a" +
                "ndroid.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));

        private SelenideElement getCard = $(By.xpath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[4]"));

//    private SelenideElement  = $(By.xpath(""));

    SwipeHelper atSwipeHelper = new SwipeHelper();

    public void  ShellCard(){

        account.shouldBe(visible).click();
        wearemarket.shouldBe(visible).click();
        ShellCardBut.shouldBe(visible).click();
        Surname.shouldBe(visible).sendKeys("Ivan");
        Name.shouldBe(visible).sendKeys("Cherkash");
        birthDate.shouldBe(visible).click();
        year.shouldBe(visible).click();
        atSwipeHelper.UpSwipe1();
        atSwipeHelper.UpSwipe1();
        atSwipeHelper.UpSwipe1();
        atSwipeHelper.UpSwipe1();
        Year1998.shouldBe(visible).click();
        okCalendarbut.shouldBe(visible).click();
        atSwipeHelper.UpSwipe();
        atSwipeHelper.UpSwipe();
        // TO DO доделать послеп фикса с бека
    }
}


