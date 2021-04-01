package tests.Profile;


import Pages.ProfilePages.foundationPage;
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
public class HelpFoundationTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    foundationPage atfoundationPage = new foundationPage();

    @Parameters({"server"})
    @Story("Check if foundation is avalible")
    public void buyFuelByMapPersomal(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atfoundationPage.checkTabletochki();
    }
}
