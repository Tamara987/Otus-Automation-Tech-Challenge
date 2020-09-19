package com.otus.pages;

import com.otus.utilities.BrowserUtils;
import com.otus.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {


    @FindBy(id = "otus-input-2")
    private WebElement emailBox;

    @FindBy(id = "otus-input-4")
    private WebElement passwordBox;

    @FindBy(xpath = "//otus-button[@class='btn-login']")
    private WebElement loginButton;

    public void loginAsStudent() {
        wait.until(ExpectedConditions.visibilityOf(emailBox)).sendKeys(ConfigurationReader.getProperty("student_username"));
        wait.until(ExpectedConditions.visibilityOf(passwordBox)).sendKeys(ConfigurationReader.getProperty("student_password"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(2);
    }

}
