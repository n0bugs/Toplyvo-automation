package tests.Fuel;

import Pages.MoveTicketToActive;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import Pages.MoveTicketToArchive;
import Pages.LoginPage;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;
import java.net.MalformedURLException;

@Severity(SeverityLevel.CRITICAL)
@Feature("Buy Fuel")
public class AddTicketActive extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    MoveTicketToActive atMoveTicketToActive = new MoveTicketToActive();

    @Test
    @Story("Add ticket to active")
    @Parameters({"server"})
    public void AddToArchiveTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atMoveTicketToActive.add_ticket_to_active();

    }
}
