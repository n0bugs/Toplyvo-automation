package Pages.VisualTestPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class UslugiPage {
    private final SelenideElement btnUslugi = $(By.id("service_tab"));

    private final SelenideElement InsuranceBlockElement = $(By.id("rlInsurance"));

    private final SelenideElement rlRoadPaymentElement = $(By.id("rlRoadPayment"));

    private final SelenideElement rlCalculationElement = $(By.id("rlCalculation"));

    private final SelenideElement rlTicketSaleElement = $(By.id("rlTicketSale"));

    private final SelenideElement rlHelpElement = $(By.id("rlHelp"));

    private final SelenideElement tvTitleInsuranceElement = $(By.id("tvTitleInsurance"));

    private final SelenideElement tvRoadPaymentElement = $(By.id("tvRoadPayment"));

    private final SelenideElement tvCalculationElement = $(By.id("tvCalculation"));

    private final SelenideElement indicatorIVElement = $(By.id("indicatorIV"));

    private final SelenideElement titleRightIvElement = $(By.id("title_right_iv"));

    public void VisualStepTestUsual() {
        btnUslugi.shouldBe(visible).click();
        InsuranceBlockElement.shouldBe(visible);
        rlRoadPaymentElement.shouldBe(visible);
        rlCalculationElement.shouldBe(visible);
        rlTicketSaleElement.shouldBe(visible);
        rlHelpElement.shouldBe(visible);
        indicatorIVElement.shouldBe(visible);
        titleRightIvElement.shouldBe(visible);
    }

    public void VisualStepTestUsualTitle() {
        tvTitleInsuranceElement.shouldHave(text("ОСАГО"));
        tvRoadPaymentElement.shouldHave(text("Оплата дорог"));
        tvCalculationElement.shouldHave(text("Расход"));
    }
}
