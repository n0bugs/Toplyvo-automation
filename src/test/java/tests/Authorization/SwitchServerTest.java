package tests.Authorization;

import Helpers.SwitchServer;
import common.AndroidSetUp;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.Feature;
import io.qameta.allure.SeverityLevel;


@Severity(SeverityLevel.CRITICAL)
@Feature("change server")
@Test

public class SwitchServerTest extends AndroidSetUp {
    @Story("Change server")
    public void switchServer_test() throws MalformedURLException, InterruptedException {
        SwitchServer atSwitchServer = new SwitchServer();
        atSwitchServer.change_sever_method();

    }
}