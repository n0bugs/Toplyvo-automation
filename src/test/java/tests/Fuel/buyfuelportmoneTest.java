package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelByPortmonePage;
import Pages.BuyFuelPages.BuyFuelNewFLowSkeleton;
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
    BuyFuelByPortmonePage atBuyFuelByPortmonePage = new BuyFuelByPortmonePage();
    BuyFuelNewFLowSkeleton atBuyFuelNewFLowSkeleton = new BuyFuelNewFLowSkeleton();


    @Parameters({"server"})
    @Story("Buy fuel with portmone")
    public void buyFuelByPortmone(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atBuyFuelNewFLowSkeleton.buyFuelSkeletonMethod();

        atBuyFuelByPortmonePage.BuyFuelPortmone();

    }
}
