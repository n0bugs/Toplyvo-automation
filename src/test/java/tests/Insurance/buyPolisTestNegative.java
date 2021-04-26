package tests.Insurance;

import Pages.PolisPages.PolisPage;
import Pages.PolisPages.PolisPageFullFilled;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.Authorization.LoginInter;

import java.net.MalformedURLException;


@Feature("Buy polis")
@Severity(SeverityLevel.CRITICAL)
@Test
public class buyPolisTestNegative extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    public PolisPageFullFilled atPolisPageFullFilled = new PolisPageFullFilled();
    public  PolisPage atPolisPageMethod = new PolisPage();

    @Parameters({"server"})
    @Story("Buy polis auto fill fields")
    public void ByPolisByCreditTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atPolisPageFullFilled.stepBuyPolisNegative();

    }
}
