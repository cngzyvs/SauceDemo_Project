package com.sauceDemoTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class YourCartPage extends BasePage{

    @FindBy(xpath = "//div/span[.='Your Cart']")
    public WebElement yorCartPageTitle;

    @FindBy(xpath = "//div/a/div")
    public List<WebElement> chosenElemens;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;


    public List<String> getChosenProductList(List<WebElement> elementList){
        List<String> shosenElementList = new ArrayList<>();
        for (WebElement element:elementList) {
            shosenElementList.add(element.getText());
        }
        return shosenElementList;
    }
}
