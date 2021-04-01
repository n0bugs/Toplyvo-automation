package tests.Fuel;

import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import Pages.TicketPages.MoveTicketToArchive;
import common.AndroidSetUp;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;

@Severity(SeverityLevel.CRITICAL)
@Feature("Buy Fuel")
public class TicketAddArchiveTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    MoveTicketToArchive atMoveTicketToArchive = new MoveTicketToArchive();

    @Test
    @Story("Add ticket to archive")
    @Parameters({"server"})
    public void AddToArchiveTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atMoveTicketToArchive.add_ticket_to_starage();

    }
}
