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

public class SwipeHelper extends AndroidSetUp{

    public void RightSwipe() {
    PointOption point = new PointOption();
    point.withCoordinates(600, 700);
    PointOption point2 = new PointOption();
    point2.withCoordinates(100, 700);
    (new TouchAction(driver))
            .longPress(point)
            .moveTo(point2)
            .release()
            .perform();
    }
    public void LeftSwipe() {
        PointOption point = new PointOption();
        point.withCoordinates(100, 700);
        PointOption point2 = new PointOption();
        point2.withCoordinates(600, 700);
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

    public void SwipeDeleteCard(){
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
        PointOption point = new PointOption();
        point.withCoordinates(363, 1002);
        PointOption point2 = new PointOption();
        point2.withCoordinates(369, 557);
        (new TouchAction(driver))
                .longPress(point)
                .moveTo(point2)
                .release()
                .perform();
    }
}
