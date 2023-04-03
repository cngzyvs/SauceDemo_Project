package com.sauceDemoTests.step_defs;

import com.sauceDemoTests.pages.DescriptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DescriptionStepDefs {
    DescriptionPage descriptionPage = new DescriptionPage();
    @Then("verify that the user is on the Description {string} page")
    public void verifyThatTheUserIsOnTheDescriptionPage(String pageText) {
        descriptionPage.assertPageTitle(pageText, descriptionPage.descriptionTextElement);
    }

    @Then("verify that sum of produts' prices and total price are equal")
    public void verifyThatSumOfProdutsPricesAndTotalPriceAreEqual() {
        Object actualTotalPrice = Double.parseDouble(descriptionPage.totalPrice.getText().replaceAll("[^0-9]",""));
        Assert.assertEquals(descriptionPage.getTotalPrices(descriptionPage.productPricesList),actualTotalPrice);
    }


}
