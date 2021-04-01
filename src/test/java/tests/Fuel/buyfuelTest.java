package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelPage;
import Pages.BuyFuelPages.ByFuelSkeleton;
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
public class buyfuelTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    ByFuelSkeleton atByFuelSkeleton = new ByFuelSkeleton();
    BuyFuelPage atBuyFuelPage = new BuyFuelPage();

    @Parameters({"server"})
    @Story("Buy fuel with personal credit")
    public void buyFuelByPersonalMoneyTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atByFuelSkeleton.BuyFuel();

        atBuyFuelPage.BuyFueel();

    }

}