package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelPage;
import Pages.BuyFuelPages.BuyFromMapPage;
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
    public void buyFuelByMapPersonal(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atbuyFromMap.BuyFuelMap();

        atBuyFuelPage.BuyFuel();

    }

}