package tests.Vignette;
import Pages.LoginPage;
import Pages.VignetteScreen;
import Pages.nonValidVignettePage;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.Authorization.LoginInter;

import java.net.MalformedURLException;

@Feature("Buy vignette")
@Severity(SeverityLevel.BLOCKER)
@Test
public class vignetteNegativeTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    VignetteScreen atVignetteScreen = new VignetteScreen();
    LoginPage atLoginPage = new LoginPage();
    nonValidVignettePage atnonValidVignettePage = new nonValidVignettePage();
    @Parameters({"server"})
    @Story("Buy vignette with personal credit negative")
    public void VignettePersonalCreditTest(String server) throws MalformedURLException, InterruptedException {

        atLoginPage.loginVariables4();

        atVignetteScreen.stepbuyVignette();

        atnonValidVignettePage.negativeVignetteCarInfo();

        atnonValidVignettePage.negativeVignetteUserInfo();

        atnonValidVignettePage.negativeVignetteFinal();

    }
}
