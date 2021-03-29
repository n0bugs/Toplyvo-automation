package tests.Fuel;

import Pages.BuyFuelByPortmonePage;
import Pages.ByFuelSkeleton;
import Pages.LoginPage;
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
public class buyfuelportmoneTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    ByFuelSkeleton atByFuelSkeleton = new ByFuelSkeleton();
    BuyFuelByPortmonePage atBuyFuelByPortmonePage = new BuyFuelByPortmonePage();


    @Parameters({"server"})
    @Story("Buy fuel with portmone")
    public void buyFuelByPortmone(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atByFuelSkeleton.BuyFuel();

        atBuyFuelByPortmonePage.BuyFuelPortmone();

    }
}
