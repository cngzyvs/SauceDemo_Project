package com.sauceDemoTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DescriptionPage extends BasePage {

    @FindBy(xpath = "//div/div[@class='cart_desc_label']")
    public WebElement descriptionTextElement;

    @FindBy(xpath = "//div/div[@class='inventory_item_price']")
    public List<WebElement> productPricesList;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    public WebElement totalPrice;


    public Object getTotalPrices(List<WebElement> pricesList){
        double totalPrice = 0;
        for (WebElement price:pricesList) {
            totalPrice += Double.parseDouble(price.getText().replaceAll("[^0-9]",""));
        }
        return totalPrice;
    }
}
