package tests.Fuel;

import Pages.BuyFuelByBusinessPage;
import Pages.ByFuelSkeleton;
import Pages.LoginPage;
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
public class NegativeFuelBusinessTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    ByFuelSkeleton atByFuelSkeleton = new ByFuelSkeleton();
    BuyFuelByBusinessPage atBuyFuelByBusinessPage = new BuyFuelByBusinessPage();
    LoginPage atLoginPage = new LoginPage();

    @Parameters({"server"})
    @Story("Buy fuel with Business account negative")
    public void buyFuelByBusiness(String server) throws MalformedURLException, InterruptedException {

        atLoginPage.loginVariables4();

        atByFuelSkeleton.BuyFuel();

        atBuyFuelByBusinessPage.BuyFuelByBusinessPageNEGAtive();
    }

}