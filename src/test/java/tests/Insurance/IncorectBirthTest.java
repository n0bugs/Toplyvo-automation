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

@Feature("Buy polis full filled/error check")
@Severity(SeverityLevel.CRITICAL)
@Test
public class IncorectBirthTest extends AndroidSetUp {
    public LoginInter atLoginInter = new LoginInter();
    public PolisPageFullFilled atPolisPage = new PolisPageFullFilled();

    @Parameters({"server"})
    @Story("Check Buy polis incorect birth field")
    public void IncorectBuyPolisName(String server) throws MalformedURLException, InterruptedException {
//      Логин
        atLoginInter.interSwitch(server);
//      Степы покупки полисов
        atPolisPage.stepBuyPolis();
//      Скелетон для покупки полиса
        atPolisPage.skeleton_full_filled();
//        Не корректно указывается поле Имя
        atPolisPage.Incorect_day_birth();
    }
}
