package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelNewFLowSkeleton;
import Pages.BuyFuelPages.BuyFuelPage;
import Pages.BuyFuelPages.BuyFuelSkeletonLiters;
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
public class buyfueOkkolTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    BuyFuelSkeletonLiters atBuyFuelSkeletonLiters = new BuyFuelSkeletonLiters();
    BuyFuelPage atBuyFuelPage = new BuyFuelPage();
    BuyFuelNewFLowSkeleton atBuyFuelNewFLowSkeleton = new BuyFuelNewFLowSkeleton();

    @Parameters({"server"})
    @Story("Buy liters okko with personal credit")
    public void buyFuelByPersonalMoneyTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atBuyFuelSkeletonLiters.buyFuelSkeletonLitersMethod();

        atBuyFuelPage.payTickets();

    }

}