package tests.Authorization;

import Pages.LoginPage;
import common.AndroidSetUp;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;


@Severity(SeverityLevel.CRITICAL)
@Feature("Login with valid otp-code")
@Test

public class loginTest extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    @Parameters({"server"})
    @Story("Login with valid otp-code")
    public void login_positive_test(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

    }
}