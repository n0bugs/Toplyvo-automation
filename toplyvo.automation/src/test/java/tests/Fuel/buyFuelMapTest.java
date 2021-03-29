package tests.Fuel;

import Pages.BuyFuelPage;
import Pages.LoginPage;
import Pages.BuyFromMapPage;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;


@Feature("Buy fuel")
@Severity(SeverityLevel.CRITICAL)
@Test
public class buyFuelMapTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    BuyFromMapPage atbuyFromMap = new BuyFromMapPage();
    BuyFuelPage atBuyFuelPage = new BuyFuelPage();

    @Parameters({"server"})
    @Story("Buy fuel from city map with personal credit")
    public void buyFuelByMapPersomal(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atbuyFromMap.BuyFuelMap();

        atBuyFuelPage.BuyFueel();

    }

}