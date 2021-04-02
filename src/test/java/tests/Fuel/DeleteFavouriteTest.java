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
public class DeleteFavouriteTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    FavouritesPage atFavouritesPage = new FavouritesPage();

    @Parameters({"server"})
    @Story("Delete Fuel to favourite")
    public void DeleteTicketToFavouties(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);
        atFavouritesPage.DeleteAtFavourite();
    }
}
