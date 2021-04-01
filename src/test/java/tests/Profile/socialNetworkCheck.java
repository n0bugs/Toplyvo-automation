package tests.Profile;

import Pages.ProfilePages.SocialNetworkPage;
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
public class socialNetworkCheck extends AndroidSetUp {

    public LoginInter atLoginInter = new LoginInter();
    public SocialNetworkPage atSocialNetworkPage = new SocialNetworkPage();

    @Parameters({"server"})
    @Story("Check social network block")
    public void checkedrefperson(String server) throws MalformedURLException, InterruptedException {

        atLoginInter.interSwitch(server);

        atSocialNetworkPage.socialNetworkMet();

    }
}
