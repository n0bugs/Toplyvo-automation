package tests.Vignette;
import Pages.LoginPage;
import Pages.VignetteScreen;
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
public class vignettePayTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    VignetteScreen atVignetteScreen = new VignetteScreen();

    @Parameters({"server"})
    @Story("Buy vignette with personal credit")
    public void VignettePersonalCreditTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atVignetteScreen.stepbuyVignette();

        atVignetteScreen.stepbuyVignette2();

    }
}
