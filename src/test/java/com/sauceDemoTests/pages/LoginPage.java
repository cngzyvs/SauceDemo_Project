package com.sauceDemoTests.pages;

import com.sauceDemoTests.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement userNameElement;

    @FindBy(id = "password")
    public WebElement passwordElement;

    @FindBy(id = "login-button")
    public WebElement loginButton;


    public void login() {
        String userName = ConfigurationReader.get("userName");
        String userPassword = ConfigurationReader.get("password");
        userNameElement.sendKeys(userName);
        passwordElement.sendKeys(userPassword);
        loginButton.click();
    }

    public void login(String userName, String password) {

        userNameElement.sendKeys(userName);
        passwordElement.sendKeys(password);
        loginButton.click();
    }
}
