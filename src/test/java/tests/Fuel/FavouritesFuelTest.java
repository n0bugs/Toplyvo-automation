package tests.Fuel;

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
public class FavouritesFuelTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    FavouritesPage atFavouritesPage = new FavouritesPage();

    @Parameters({"server"})
    @Story("Add Fuel to favourite")
    public void AddTicketToFavouties(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);
        atFavouritesPage.FavouritesPageAction();
    }
}
