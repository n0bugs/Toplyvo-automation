package tests.Bonuses;

import Pages.AutorizePage.LoginPage;
import common.AndroidSetUp;
import Pages.BonusesPages.BonusesPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;


@Severity(SeverityLevel.CRITICAL)
@Feature("Bonuses")
@Test

public class bonusesTest extends AndroidSetUp {

    public LoginPage atLoginPage = new LoginPage();
    BonusesPage atBonusesPage = new BonusesPage();
    public LoginInter atLoginInter = new LoginInter();

    @Parameters({"server"})
    @Story("Check referal link")
    public void bonusTest(String server) throws MalformedURLException, InterruptedException {
        atLoginInter.interSwitch(server);

//        atLoginPage.loginVariables3();

        atBonusesPage.checkRefLink();

    }
}
