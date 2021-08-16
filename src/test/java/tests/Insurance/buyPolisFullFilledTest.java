package tests.Insurance;

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


@Feature("Buy polis full filled")
@Severity(SeverityLevel.CRITICAL)
@Test
public class buyPolisFullFilledTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    public PolisPageFullFilled atPolisPage = new PolisPageFullFilled();
    public PolisPageFullFilled atPolisPageMethod = new PolisPageFullFilled();
    public PolisPageFullFilled AtPolisPageCheck = new PolisPageFullFilled();

    @Parameters({"server"})
    @Story("Buy polis manual fill fields")
    public void ByPolisByFullFilledTest(String server) throws MalformedURLException, InterruptedException {
// Логин
        atLoginInter.interSwitch(server);
// Степы покупки полисов
        atPolisPage.stepBuyPolis();

        atPolisPage.StepFullFilled();
// Покупка картой
        atPolisPageMethod.creditcardpolis();
// Проверка
        AtPolisPageCheck.checkPurchasePolis();

    }
}