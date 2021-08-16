package tests.Bonuses;

import Pages.AuthorizationPages.LoginPage;
import Pages.ProfilePages.ShellCardCheck;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;


@Severity(SeverityLevel.MINOR)
@Feature("Bonuses")
@Test

public class shellCardTest extends AndroidSetUp {

    public LoginPage atLoginPage = new LoginPage();
    public LoginInter atLoginInter = new LoginInter();
    public ShellCardCheck atShellCardCheck = new ShellCardCheck();

    @Parameters({"server"})
    @Story("check shell loyaliti card")
    public void bonusTest() throws InterruptedException {

        atLoginPage.loginVariables4();

        atShellCardCheck.ShellCard();

    }
}
