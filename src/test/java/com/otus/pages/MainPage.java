package com.otus.pages;

import com.otus.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase{

    @FindBy(xpath = "//a[text()='Login']")
    private WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(2);
    }
}
