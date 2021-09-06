package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelByBusinessPage;
import Pages.BuyFuelPages.BuyFuelNewFLowSkeleton;
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
public class NegativeFuelBusinessTest extends AndroidSetUp {

    BuyFuelByBusinessPage atBuyFuelByBusinessPage = new BuyFuelByBusinessPage();
    LoginPage atLoginPage = new LoginPage();
    BuyFuelNewFLowSkeleton atBuyFuelNewFLowSkeleton = new BuyFuelNewFLowSkeleton();

    @Parameters({"server"})
    @Story("Buy fuel with Business account negative")
    public void buyFuelByBusiness() {

        atLoginPage.loginVariables4();

        atBuyFuelNewFLowSkeleton.buyFuelSkeletonMethodNEWuser();

        atBuyFuelByBusinessPage.BuyFuelByBusinessPageNEGAtive();
    }

}