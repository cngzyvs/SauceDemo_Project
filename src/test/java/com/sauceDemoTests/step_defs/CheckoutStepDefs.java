package com.sauceDemoTests.step_defs;

import com.sauceDemoTests.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefs {

    CheckoutPage checkoutPage = new CheckoutPage();
    @Then("verify that the user is on the Checkout {string} page")
    public void verifyThatTheUserIsOnTheCheckoutPage(String checkoutText) {
        checkoutPage.assertPageTitle(checkoutText,checkoutPage.checkoutPageTitle);
    }

    @When("the user fills the form with first name {string} last name {string} and cip code {string}")
    public void theUserFillsTheFormWithFirstNameLastNameAndCipCode(String firstName, String lastName, String zipCode) {

checkoutPage.formFirstNameElement.sendKeys(firstName);
checkoutPage.formSurnameElement.sendKeys(lastName);
checkoutPage.formZipCodeElement.sendKeys(zipCode);

    }

    @And("the user clicks continue button")
    public void theUserClicksContinueButton() {
        checkoutPage.continueButton.click();
    }
}
