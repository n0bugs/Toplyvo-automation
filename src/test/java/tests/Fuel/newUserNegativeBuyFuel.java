package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelNewFLowSkeleton;
import Pages.BuyFuelPages.BuyFuelPage;
import Pages.AuthorizationPages.LoginPage;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;


@Feature("Buy fuel")
@Severity(SeverityLevel.CRITICAL)
@Test
public class newUserNegativeBuyFuel extends AndroidSetUp {

    LoginPage atLoginPage = new LoginPage();
    BuyFuelPage atBuyFuelPage = new BuyFuelPage();
    BuyFuelNewFLowSkeleton atBuyFuelNewFLowSkeleton = new BuyFuelNewFLowSkeleton();

    @Parameters({"server"})
    @Story("Buy fuel with personal credit negative")
    public void buyFuelByPersonalMoneyTest() {

        atLoginPage.loginVariables4();

        atBuyFuelNewFLowSkeleton.buyFuelSkeletonMethodNEWuser();

        atBuyFuelPage.BuyFueelNegative();
    }
}