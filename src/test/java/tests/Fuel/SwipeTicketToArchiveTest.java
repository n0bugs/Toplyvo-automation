package tests.Fuel;

import Pages.BuyFuelPages.SwipeTicketToArchive;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import common.AndroidSetUp;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;

@Severity(SeverityLevel.NORMAL)
@Feature("Tickets")
public class SwipeTicketToArchiveTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    SwipeTicketToArchive atSwipeTicketToArchive = new SwipeTicketToArchive();

    @Test
    @Story("Add ticket to archive")
    @Parameters({"server"})
    public void swipeTicketToArchiveTest(String server) throws MalformedURLException, InterruptedException {
        atLoginInter.interSwitch(server);
        atSwipeTicketToArchive.SwipeActionStep();
    }
}
