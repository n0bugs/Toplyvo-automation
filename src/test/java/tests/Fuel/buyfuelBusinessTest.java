package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelByBusinessPage;
import Pages.BuyFuelPages.BuyFuelNewFLowSkeleton;
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
public class buyfuelBusinessTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    BuyFuelByBusinessPage atBuyFuelByBusinessPage = new BuyFuelByBusinessPage();
    BuyFuelNewFLowSkeleton atBuyFuelNewFLowSkeleton = new BuyFuelNewFLowSkeleton();

    @Parameters({"server"})
    @Story("Buy fuel with Business account")
    public void buyFuelByBusiness(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atBuyFuelNewFLowSkeleton.buyFuelSkeletonMethod();

        atBuyFuelByBusinessPage.BuyFuelByBusinessPageM();
    }

}