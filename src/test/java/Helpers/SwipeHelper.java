package Helpers;

import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class SwipeHelper extends AndroidSetUp {

    public SelenideElement unableToView = $(By.id("l_expect_to_receive"));

    public SelenideElement unableToViewShowMoreStep = $(By.id("headerPrimaryText"));

    public void refreshSwipe() {
        PointOption point = new PointOption();
        point.withCoordinates(592, 523);
        PointOption point2 = new PointOption();
        point2.withCoordinates(592, 728);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void DownSwipe() {
        PointOption point = new PointOption();
        point.withCoordinates(612, 1374);
        PointOption point2 = new PointOption();
        point2.withCoordinates(577, 391);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();


    }

    public void UpSwipe() {
        PointOption point = new PointOption();
        point.withCoordinates(300, 500);
        PointOption point2 = new PointOption();
        point2.withCoordinates(300, 1000);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void SwipeDeleteCard() {
        PointOption point = new PointOption();
        point.withCoordinates(620, 244);
        PointOption point2 = new PointOption();
        point2.withCoordinates(88, 254);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void UpSwipe1() {
        PointOption point = new PointOption();
        point.withCoordinates(550, 650);
        PointOption point2 = new PointOption();
        point2.withCoordinates(300, 1400);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void DownSwipe1() {
        unableToView.shouldBe(visible);

        PointOption point = new PointOption();
        point.withCoordinates(351, 1327);
        PointOption point2 = new PointOption();
        point2.withCoordinates(349, 418);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void DownSwipe2() {
        PointOption point = new PointOption();
        point.withCoordinates(351, 1327);
        PointOption point2 = new PointOption();
        point2.withCoordinates(349, 418);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void ScrollToShowTicket() {
        unableToViewShowMoreStep.shouldBe(visible);

        PointOption point = new PointOption();
        point.withCoordinates(335, 1346);
        PointOption point2 = new PointOption();
        point2.withCoordinates(382, 275);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void refreshArhive() {
        PointOption point = new PointOption();
        point.withCoordinates(347, 410);
        PointOption point2 = new PointOption();
        point2.withCoordinates(329, 945);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }
}
