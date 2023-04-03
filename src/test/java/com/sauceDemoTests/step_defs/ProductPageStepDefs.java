package com.sauceDemoTests.step_defs;

import com.sauceDemoTests.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPageStepDefs {
    ProductPage productPage = new ProductPage();
    @When("the user sorts products from high to low")
    public void the_user_sorts_products_from_high_to_low() {
        Select select= new Select(productPage.sortElement);
        select.selectByValue("hilo");
        select.getFirstSelectedOption();
    }

    @And("the user chooses three products and adds to cart")
    public void theUserChoosesThreeProductsAndAddsToCart() {
        List<WebElement> chosenProductsElements = productPage.getChosenProductsElements();
        for (WebElement element:chosenProductsElements) {
            element.click();
        }
    }

    @Then("verify that shopping cart shows {string} chosen products")
    public void verifyThatShoppingCartShowsChosenProducts(String productCount) {
        String actualProductCount = productPage.addToCartIkon.getText();
        Assert.assertEquals(productCount,actualProductCount);

    }

    @Then("verify that the user access the product page {string} successfully")
    public void verifyThatTheUserAccessTheProductPageSuccessfully(String productsPageTitle) {
        productPage.assertPageTitle(productsPageTitle,productPage.ptoductPageTitle);
    }

    @And("navigate to your cart page")
    public void navigateToYourCartPage() {
        productPage.addToCartIkon.click();
    }
}
