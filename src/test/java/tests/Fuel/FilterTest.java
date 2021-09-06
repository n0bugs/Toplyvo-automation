package tests.Fuel;

import Pages.BuyFuelPages.FilterFuelPage;
import common.AndroidSetUp;
import tests.Authorization.LoginInter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;

@Feature("Filter Fuel Test")
@Severity(SeverityLevel.NORMAL)
@Test
public class FilterTest extends AndroidSetUp {
    private final LoginInter atLoginInter = new LoginInter();
    private final FilterFuelPage atFilterFuelPage = new FilterFuelPage();

    @Parameters({"server"})
    @Story("Disable all fuel station")
    public void filterStepTest(String server) throws MalformedURLException, InterruptedException {
        atLoginInter.interSwitch(server);

        atFilterFuelPage.filterFuel();
    }
}
