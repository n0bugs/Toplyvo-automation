package tests.Fuel;

import Pages.AuthorizationPages.LoginPage;
import Pages.TicketPages.LoadTicketPage;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.Authorization.LoginInter;

import java.net.MalformedURLException;

@Feature("Buy fuel")
@Severity(SeverityLevel.CRITICAL)
@Test
public class LoadTicketTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    LoginPage atLoginPage = new LoginPage();
    LoadTicketPage atLoadTicketPage = new LoadTicketPage();

    @Parameters({"server"})
    @Story("Buy fuel with personal credit")
    public void LoadTicketBtn() {
        atLoginPage.loginVariableLoadTicket();
        atLoadTicketPage.LoadTicketStep();
    }
}
