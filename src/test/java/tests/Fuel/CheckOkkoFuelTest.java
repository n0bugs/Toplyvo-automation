package tests.Fuel;

import Pages.BuyFuelPages.BuyFuelPage;
import Pages.BuyFuelPages.OkkoLitersPage;
import Pages.FavouritesPages.FavouritesPage;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.Authorization.LoginInter;

import java.net.MalformedURLException;

@Feature("Favourite fuel")
@Severity(SeverityLevel.CRITICAL)
@Test
public class CheckOkkoFuelTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    OkkoLitersPage atOkkoLitersPage = new OkkoLitersPage();

    @Parameters({"server"})
    @Story("Check if liters exist on main screen")
    public void CheckOKKOliters(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atOkkoLitersPage.CheckLiter();
    }
}

