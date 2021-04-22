package tests.Fuel;

import Pages.BuyFuelPages.BuyFromMapPage;
import Pages.BuyFuelPages.BuyFuelPage;
import Pages.BuyFuelPages.CheckWaitTicketsPage;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.Authorization.LoginInter;

import java.net.MalformedURLException;


@Feature("Buy fuel")
@Severity(SeverityLevel.CRITICAL)
@Test
public class CheckIfWaitForTicketsExistTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    CheckWaitTicketsPage atCheckWaitTicketsPage = new CheckWaitTicketsPage();
    BuyFuelPage atBuyFuelPage = new BuyFuelPage();

    @Parameters({"server"})
    @Story("Buy fuel from city map with personal credit")
    public void checkWaitTickets(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atCheckWaitTicketsPage.CheckMetod();



    }

}