package tests.Bonuses;
import Pages.BonusesTermsPage;
import Pages.LoginPage;
import common.AndroidSetUp;
import Pages.BonusesPage;
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

public class bonusesThermsCheck extends AndroidSetUp {

    public LoginPage atLoginPage = new LoginPage();
    BonusesTermsPage atBonusesTermsPage = new BonusesTermsPage();
    public LoginInter atLoginInter = new LoginInter();

    @Parameters({"server"})
    @Story("Bonuses therms policy test")
    public void bonusTest(String server) throws MalformedURLException, InterruptedException {
        atLoginInter.interSwitch(server);

//        atLoginPage.loginVariables3();

        atBonusesTermsPage.bonusesTermsMet();

    }
}
