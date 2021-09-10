package tests.Authorization;

import Interfase.DoLoginInterfase;
import Interfase.ProductionLogin;
import Interfase.StageLogin;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

@Severity(SeverityLevel.CRITICAL)
@Feature("Login with valid otp-code")
@Test

public class LoginInter {
    @Parameters({"server"})

    public void interSwitch(String server) throws MalformedURLException, InterruptedException {
        DoLoginInterfase loginInterface;
        switch (server) {
            case "prod":
                loginInterface = new ProductionLogin();
                break;
            case "stage":
                loginInterface = new StageLogin();
                break;
            default:
                loginInterface = new StageLogin();
                break;
        }
        loginInterface.dologin();
    }
}
