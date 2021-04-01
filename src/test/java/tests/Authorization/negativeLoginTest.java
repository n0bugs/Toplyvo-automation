package tests.Authorization;

import Pages.AutorizePage.LoginPage;
import common.AndroidSetUp;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;


@Severity(SeverityLevel.CRITICAL)
@Feature("Autorization")
public class negativeLoginTest extends AndroidSetUp {

    LoginPage atLoginPage = new LoginPage();

    @Test
    @Story("Negative login")
    public void login_negative_test() throws MalformedURLException, InterruptedException {
        atLoginPage.loginVariables2();
    }
}