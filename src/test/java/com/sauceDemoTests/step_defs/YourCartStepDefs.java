package com.sauceDemoTests.step_defs;

import com.sauceDemoTests.pages.ProductPage;
import com.sauceDemoTests.pages.YourCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class YourCartStepDefs {

    YourCartPage yourCartPage = new YourCartPage();
    ProductPage productPage = new ProductPage();
    @Then("verify that the user is on the Your Cart {string} page")
    public void verifyThatTheUserIsOnTheYourCartPage(String pageTitle) {
        yourCartPage.assertPageTitle(pageTitle,yourCartPage.yorCartPageTitle);
    }

    @Then("verify that right products are in the shopping cart")
    public void verifyThatRightProductsAreInTheShoppingCart(List<String> chosenProducList) {
        List<String> actualChosenProductList = yourCartPage.getChosenProductList(yourCartPage.chosenElemens);
        Assert.assertEquals(chosenProducList,actualChosenProductList);
    }

    @When("the user clciks checkout button")
    public void theUserClciksCheckoutButton() {
        yourCartPage.checkoutButton.click();
    }


}
