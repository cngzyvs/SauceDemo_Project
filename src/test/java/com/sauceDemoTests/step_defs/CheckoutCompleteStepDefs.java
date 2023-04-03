package com.sauceDemoTests.step_defs;

import com.sauceDemoTests.pages.CheckoutCopmletePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompleteStepDefs {

    CheckoutCopmletePage checkoutCopmletePage = new CheckoutCopmletePage();
    @And("the user clicks finish button")
    public void theUserClicksFinishButton() {
        checkoutCopmletePage.finishButton.click();
    }

    @Then("verify that the user is on the Checkout Complete {string} page")
    public void verifyThatTheUserIsOnTheCheckoutCompletePage(String pageTitleText) {
        checkoutCopmletePage.assertPageTitle(pageTitleText,checkoutCopmletePage.checkoutCompleteElement);
    }
}
