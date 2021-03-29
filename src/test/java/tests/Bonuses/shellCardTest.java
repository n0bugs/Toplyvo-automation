package tests.Bonuses;
import Pages.BonusesTermsPage;
import Pages.LoginPage;
import Pages.ShellCardCheck;
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

public class shellCardTest extends AndroidSetUp {

    public LoginPage atLoginPage = new LoginPage();
    public LoginInter atLoginInter = new LoginInter();
    public ShellCardCheck atShellCardCheck = new ShellCardCheck();
    @Parameters({"server"})
    @Story("check shell loyaliti card")
    public void bonusTest(String server) throws MalformedURLException, InterruptedException {
//        atLoginInter.interSwitch(server);

        atLoginPage.loginVariables4();

        atShellCardCheck.ShellCard();

    }
}
