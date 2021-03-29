package tests.Profile;

import Pages.BuyFuelPage;
import Pages.DeleteBankCardPages;
import Pages.LoginPage;
import Pages.BuyFromMapPage;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;


@Feature("Profile")
@Severity(SeverityLevel.CRITICAL)
@Test
public class DeleteBankCardTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    DeleteBankCardPages atDeleteBankCardPages = new DeleteBankCardPages();

    @Parameters({"server"})
    @Story("Delete bank card profile")
    public void buyFuelByMapPersomal(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);
        atDeleteBankCardPages.delete_bank_card();

    }
}