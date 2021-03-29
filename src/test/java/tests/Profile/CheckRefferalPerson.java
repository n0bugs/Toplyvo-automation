package tests.Profile;

import Pages.CheckRefferalPage;
import common.AndroidSetUp;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.Authorization.LoginInter;

import java.net.MalformedURLException;

@Feature("Profile/Bonus")
@Severity(SeverityLevel.CRITICAL)
@Test
public class CheckRefferalPerson extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    public CheckRefferalPage atCheckRefferalPage = new CheckRefferalPage();

    @Parameters({"server"})
    @Story("Check inveted people and bonus balance")
    public void checkedrefperson(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);
        atCheckRefferalPage.checkrefpesonal();

    }
}
