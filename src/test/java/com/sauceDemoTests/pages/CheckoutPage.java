package com.sauceDemoTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(xpath = "//div/span[@class=\"title\"]")
    public WebElement checkoutPageTitle;

    @FindBy(id = "first-name")
    public WebElement formFirstNameElement;

    @FindBy(id = "last-name")
    public WebElement formSurnameElement;

    @FindBy(id = "postal-code")
    public WebElement formZipCodeElement;

    @FindBy(id = "continue")
    public WebElement continueButton;


}
