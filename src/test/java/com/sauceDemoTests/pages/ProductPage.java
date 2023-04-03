package com.sauceDemoTests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortElement;

    @FindBy(id= "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement productOne;

    @FindBy(id= "add-to-cart-sauce-labs-backpack")
    public WebElement productTwo;

    @FindBy(id= "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement productThree;

    @FindBy(xpath= "//a[@class='shopping_cart_link']")
    public WebElement addToCartIkon;

    @FindBy(xpath = "//div/span[.='Products']")
    public WebElement ptoductPageTitle;


    public List<WebElement> getChosenProductsElements(){
        List<WebElement> productList = new ArrayList<>();
        productList.add(productOne);
        productList.add(productTwo);
        productList.add(productThree);
        return productList;
    }


}
