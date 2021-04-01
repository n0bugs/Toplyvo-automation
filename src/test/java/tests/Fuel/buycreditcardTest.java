package tests.Fuel;

import Pages.BuyFuelPages.BuyCreditcardPage;
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


@Feature("Buy fuel (credit card)")
@Severity(SeverityLevel.CRITICAL)
@Test
public class buycreditcardTest extends AndroidSetUp {
    public BuyCreditcardPage atBuyCredit = new BuyCreditcardPage();
    public LoginInter atLoginInter = new LoginInter();
    ByFuelSkeleton atByFuelSkeleton = new ByFuelSkeleton();

    @Parameters({"server"})
    @Story("Buy fuel with credit card")
    public void BuyFuelWithCreditCardTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atByFuelSkeleton.BuyFuel();

        atBuyCredit.BuyCredit();

    }

}