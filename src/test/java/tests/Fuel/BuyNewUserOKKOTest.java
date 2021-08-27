package tests.Fuel;

import Pages.AuthorizationPages.LoginPage;
import Pages.BuyFuelPages.BuyFuelNewFLowSkeleton;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;


@Severity(SeverityLevel.NORMAL)
@Feature("OKKO")
@Test
public class BuyNewUserOKKOTest extends AndroidSetUp {
    public LoginPage atLoginPage = new LoginPage();
    public BuyFuelNewFLowSkeleton atBuyFuelNewFLowSkeleton = new BuyFuelNewFLowSkeleton();

    @Parameters({"server"})
    @Story("register new user OKKO")
    public void buyNewUserOKKOTest() {
        atLoginPage.loginVariables4();
        atBuyFuelNewFLowSkeleton.BuyOKKOMethod();
    }
}
