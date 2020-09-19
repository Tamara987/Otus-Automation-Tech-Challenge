package com.otus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassesPage extends PageBase {

    @FindBy(xpath = "//p[text()='Classes']")
    private WebElement subTitle;

    public String getSubTitle(){
        return subTitle.getText();
    }

    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    public WebElement qaTechChallengeBox;

    @FindBy(xpath = "//div[@class='ot-post-summary__post-header']")
    public WebElement welcomeBox;

    @FindBy(xpath = "//button[@class='ng-star-inserted' and @trim='true']")
    public WebElement deleteIcon;

    @FindBy(xpath = "//div[@class='buttons']//button[@color='default' and @size='medium']")
    public WebElement confirmDelete;

    @FindBy(xpath = "//button[@class='ng-star-inserted' and @display='inline' and @size='medium']")
    public WebElement comment;

    @FindBy(xpath = "//textarea[@placeholder='Start typing comment here...']")
    public WebElement textArea;

    @FindBy(xpath = "//div[@class='save-button']//button[@color='default']")
    public WebElement saveCommentButton;

    @FindBy(xpath = "//button//span[contains(text(), 'Join Class')]")
    public WebElement joinClassButton;

    @FindBy(xpath = "//div//span[@class='truncate' and contains(text(), 'Join Class')]")
    public WebElement joinClassModalBox;
}
