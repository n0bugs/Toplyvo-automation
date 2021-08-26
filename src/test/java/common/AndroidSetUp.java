package common;

import java.io.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Helpers.AllureEnv;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class AndroidSetUp {
    private static final String KEY = "server";
    protected static AppiumDriver<MobileElement> driver;

    @BeforeClass(alwaysRun = true)
    @Parameters({"device", "server"})
    public void setUP(String device, String server) throws Exception {
        if (device.equalsIgnoreCase("Samsung  A30S")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            String value = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(KEY);
            System.out.println("server is eq = " + value);
            if (value.equalsIgnoreCase("stage")) {
                String apk_path = "src/test/resources/TOPLYVO_UA_toplyvoDebug_2_7_43_debug_testfeature_26_08_21_09_57.apk";
                File app = new File(apk_path);
                System.out.println("Stage build");
                cap.setCapability("appPackage", "ua.fuel.debug");
                cap.setCapability("app", app.getAbsolutePath());
            } else {
                String apk_path = "src/test/resources/TOPLYVO_UA-prodRelease-2.6.72 22.03.21 15.12.apk";
                File app = new File(apk_path);
                cap.setCapability("app", app.getAbsolutePath());
                cap.setCapability("appPackage", "ua.fuel");
                System.out.println("PROD build");
            }
            cap.setCapability("deviceName", "Samsung  A30S");
            cap.setCapability("platformName", "Android");
            cap.setCapability("appActivity", "ua.fuel.ui.splash.SplashActivity");
            cap.setCapability("platformVersion", "11");
            cap.setCapability("automationName", "uiautomator2");
            cap.setCapability("language", "RU");
            cap.setCapability("locale", "RU");
            cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            WebDriverRunner.setWebDriver(driver);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            SelenideLogger
                    .addListener("AllureSelenide", new AllureSelenide()
                            .screenshots(true).savePageSource(false));
        }
        if (device.equalsIgnoreCase("Samsung  SM-J730F")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            String value = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(KEY);
            if (value.equalsIgnoreCase("stage")) {
                String apk_path = "src/test/resources/TOPLYVO_UA_toplyvoDebug_2_7_43_debug_testfeature_26_08_21_09_57.apk";
                File app = new File(apk_path);
                System.out.println("Stage build");
                capabilities.setCapability("appPackage", "ua.fuel.debug");
                capabilities.setCapability("app", app.getAbsolutePath());
            } else {
                String apk_path = "src/test/resources/TOPLYVO_UA-prodRelease-2.6.72 22.03.21 15.12.apk";
                File app = new File(apk_path);
                capabilities.setCapability("app", app.getAbsolutePath());
                capabilities.setCapability("appPackage", "ua.fuel");
                System.out.println("PRODE build");
            }
            capabilities.setCapability("deviceName", "Samsung  SM-J730F");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appActivity", "ua.fuel.ui.splash.SplashActivity");
            capabilities.setCapability("platformVersion", "9");
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("language", "RU");
            capabilities.setCapability("locale", "RU");
            capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4724/wd/hub"), capabilities);
            WebDriverRunner.setWebDriver(driver);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            SelenideLogger
                    .addListener("AllureSelenide", new AllureSelenide()
                            .screenshots(true).savePageSource(false));
        }
    }

    @AfterSuite
    @Parameters({"server"})
    public void generalEnv(String server) {
        AllureEnv atAllureEnv = new AllureEnv();
        String value = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(KEY);
        System.out.println("server is eq = " + value);
        if (value.equalsIgnoreCase("stage")) {
            atAllureEnv.envStage();
        } else {
            atAllureEnv.envProd();
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        closeWebDriver();
    }
}
