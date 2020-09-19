package com.otus.pages;

import com.otus.utilities.BrowserUtils;
import com.otus.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);
    protected Actions actions = new Actions(driver);

    @FindBy(xpath = "//div[text()='Tamara']")
    private WebElement userName;


    public PageBase() {
        PageFactory.initElements(driver, this);
    }

    public String getUserName() {
        return userName.getText();
    }

    public void navigateTo(String moduleName) {
        String iconXpath = "//span[text()='" + moduleName + "']/preceding-sibling::ot-icon";
        String moduleXpath = "//span[text()='" + moduleName + "']";
        WebElement iconElement = driver.findElement(By.xpath(iconXpath));
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));
        actions.moveToElement(iconElement).pause(2000).click(moduleElement).pause(3000).build().perform();
    }
}
