package tests.Authorization;

import Pages.AutorizePage.LogOutPages;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;



@Severity(SeverityLevel.CRITICAL)
@Feature("Autorization")
public class LogautTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
//    LoginPage atLoginPage = new LoginPage();
    LogOutPages atLogOutPages = new LogOutPages();

    @Test
    @Story("LogAut in profile")
    @Parameters({"server"})
    public void login_negative_test(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atLogOutPages.logOutmethod();
    }
}