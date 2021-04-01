package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelPage;
import Pages.BuyFuelPages.ByFuelSkeleton;
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
public class buyfueltabletochki extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    ByFuelSkeleton atByFuelSkeleton = new ByFuelSkeleton();
    BuyFuelPage atBuyFuelPage = new BuyFuelPage();

    @Parameters({"server"})
    @Story("Buy fuel with personal credit with tabletochki")
    public void buyFuelByPersonalMoneyTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atByFuelSkeleton.BuyFuelTablPositive();

        atBuyFuelPage.BuyFueel();

    }
}
