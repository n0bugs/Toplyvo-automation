package tests.Fuel;

import Pages.BuyFuelPages.ShareLitersWOGPage;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import common.AndroidSetUp;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;


@Severity(SeverityLevel.CRITICAL)
@Feature("Tickets")
public class ShareLiterWogTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    ShareLitersWOGPage atShareLitersWOGPage = new ShareLitersWOGPage();

    @Test
    @Story("Add ticket to active")
    @Parameters({"server"})
    public void ShareTicketWogTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atShareLitersWOGPage.ShareWOGAction();

    }
}
