package com.sauceDemoTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCopmletePage extends BasePage{

    @FindBy(xpath = "//div/span[@class='title']")
    public WebElement checkoutCompleteElement;

    @FindBy(id= "finish")
    public WebElement finishButton;
}
