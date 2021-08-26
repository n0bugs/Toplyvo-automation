package tests.VisualTest;

import Pages.VisualTestPage.UslugiPage;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;
import tests.Authorization.LoginInter;


@Feature("Visual test Услуги")
@Severity(SeverityLevel.MINOR)
@Test
public class UslugiVisualTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    UslugiPage atUslugiPage = new UslugiPage();

    @Parameters({"server"})
    @Story("Check all element is visible in chapter 'Uslugi'")
    public void VisualUslugiTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);
        atUslugiPage.VisualStepTestUsual();
        atUslugiPage.VisualStepTestUsualTitle();

    }
}
