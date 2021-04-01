package tests.Insurance;

import Pages.PolisPages.PolisPage;
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
public class buyPolisTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    public PolisPage atPolisPage = new PolisPage();
    public  PolisPage atPolisPageMethod = new PolisPage();
    public PolisPage AtPolisPageCheck = new PolisPage();

    @Parameters({"server"})
    @Story("Buy polis auto fill fields")
    public void ByPolisByCreditTest(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atPolisPage.stepBuyPolis();

        atPolisPageMethod.creditcardpolis();

        AtPolisPageCheck.checkPurchasePolis();

    }
}
