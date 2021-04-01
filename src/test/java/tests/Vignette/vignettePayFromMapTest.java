package tests.Vignette;
import Pages.VignettePages.VignetteMapScreen;
import Pages.VignettePages.VignetteScreen;
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
public class vignettePayFromMapTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    VignetteScreen atVignetteScreen = new VignetteScreen();
    VignetteMapScreen atVignetteMapScreen = new VignetteMapScreen();

    @Parameters({"server"})
    @Story("Buy vignette with personal credit from map")
    public void VignettePersonalCreditTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atVignetteMapScreen.stepMapVignette();

        atVignetteScreen.stepbuyVignette2();

    }
}
