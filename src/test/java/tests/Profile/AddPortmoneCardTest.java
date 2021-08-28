package tests.Profile;

import Pages.ProfilePages.AddPortmoneCardPage;
import Pages.TicketPages.MoveTicketToActive;
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
@Feature("Profile")
public class AddPortmoneCardTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    AddPortmoneCardPage atAddPortmoneCardPage = new AddPortmoneCardPage();

    @Test
    @Story("Add Portmone Card")
    @Parameters({"server"})
    public void addPortmoneCardTest(String server) throws MalformedURLException, InterruptedException {
        atLoginInter.interSwitch(server);

        atAddPortmoneCardPage.AddPortmoneCardAction();
    }
}
