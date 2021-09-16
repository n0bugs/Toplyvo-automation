package Helpers;

import com.codeborne.selenide.SelenideElement;
import common.AndroidSetUp;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;


public class SwipeHelper extends AndroidSetUp {

    public SelenideElement unableToView = $(By.id("l_expect_to_receive"));

    public SelenideElement unableToViewShowMoreStep = $(By.id("headerPrimaryText"));

    public SelenideElement unableToViewPortmone = $(By.id("swipe"));

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

    public void refreshSwipe2() {
        TouchAction touch = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int edgeBorder = 10;
        sleep(2000);
        touch
                .press(point(size.width / 2, size.height / 2))
                .waitAction(waitOptions(ofMillis(5000)))
                .moveTo(point(size.width / 2, size.height - edgeBorder)).release().perform();
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

    public void deletePortmoneCardSwiper() {
        unableToViewPortmone.shouldBe(visible);

        PointOption point = new PointOption();
        point.withCoordinates(623, 260);
        PointOption point2 = new PointOption();
        point2.withCoordinates(106, 257);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }

    public void swipeToArchive() {
        unableToViewShowMoreStep.shouldBe(visible);

        PointOption point = new PointOption();
        point.withCoordinates(144, 747);
        (new TouchAction(driver))
                .longPress(point)
                .release()
                .perform();

    }

    public void swipeScreenToArchive() {
        PointOption point = new PointOption();
        point.withCoordinates(645, 436);
        PointOption point2 = new PointOption();
        point2.withCoordinates(71, 434);
        (new TouchAction(driver))
                .press(point)
                .moveTo(point2)
                .release()
                .perform();
    }
}
