package com.sauceDemoTests.pages;

import com.sauceDemoTests.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void assertPageTitle(String str,WebElement element){
        String expextPageTitle = str;
        String actualPageTitle = element.getText();
        Assert.assertEquals(expextPageTitle,actualPageTitle);
    }
}
