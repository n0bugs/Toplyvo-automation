package tests.VisualTest;

import Pages.VisualTestPage.AccountPage;
import Pages.VisualTestPage.UslugiPage;
import common.AndroidSetUp;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;

@Feature("Visual test Аккаунт")
@Severity(SeverityLevel.MINOR)
@Test
public class AccountVisualTest extends AndroidSetUp{
    public LoginInter atLoginInter = new LoginInter();
    AccountPage atAccountPage = new AccountPage();

    @Parameters({"server"})
    @Story("Check all element is visible in chapter 'Account'")
    public void accountVisualTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);
        atAccountPage.VisualStepTestAccount();
    }
}
