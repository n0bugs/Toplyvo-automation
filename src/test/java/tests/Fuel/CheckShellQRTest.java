package tests.Fuel;

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
public class CheckShellQRTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    Pages.BuyFuelPages.CheckShellQRPage atCheckShellQRPage = new Pages.BuyFuelPages.CheckShellQRPage();

    @Test
    @Story("Check Shell QR Ticket")
    @Parameters({"server"})
    public void checkShellQRTest(String server) throws MalformedURLException, InterruptedException {
        atLoginInter.interSwitch(server);

        atCheckShellQRPage.checkShellQRAction();
    }
}