package com.sauceDemoTests.step_defs;

import com.sauceDemoTests.pages.LoginPage;
import com.sauceDemoTests.utilities.ConfigurationReader;
import com.sauceDemoTests.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    /**

     1-  Create a cucumber project from scratch. Design all packages, classes and ohter files...
     2- Navigate to https://www.saucedemo.com/
     3-Login with valid credentials (shown on the page)
     4-Sort the products high to  low
     5- Add to cart at least two item
     6- Assert that the basket shows the true number of product
     7-Navigate to Your cart page
     8-Assert that the right items added to cart
     9-go to checkout page and fill the form
     10-click continue button and go to the checkout overview page
     11-Assert the price of items
     12-Click finish and assert the success shopping message

     notes:     a. every new page should be asserted by page title
     b. to have maximum step with minimum method  use the parameterized methods.
     c. This is an e2e test so u can create one feature for this task called success shopping but login
     feature should be designed seperately.


     last note: negative login tests are optinal....maybe we can add these step later.
     good luck.

     */
    LoginPage loginPage = new LoginPage();
    @Given("go to web page")
    public void go_to_web_page() {
       String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters user name {string} and password {string} and clicks login button")
    public void theUserEntersUserNameAndPasswordAndClicksLoginButton(String userName, String password) {
        loginPage.login(userName,password);
    }
}
