package com.otus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LessonsPage extends PageBase {

    @FindBy(xpath = "//p[text()='Lessons']")
    private WebElement subTitle;

    public String getSubTitle(){
        return subTitle.getText();
    }

    @FindBy(xpath = "//tr[@class='ng-star-inserted']")
    public WebElement lessonTitle;

    @FindBy(xpath = "//ot-card[@cursor='pointer']/../..//lesson-card[1]")
    public WebElement activityTestPlan;

    @FindBy(xpath = "//ot-card[@cursor='pointer']/../..//lesson-card[2]")
    public WebElement activityFunctionalTests;

    @FindBy(xpath = "//ot-card[@cursor='pointer']/../..//lesson-card[3]")
    public WebElement activityIntegrationTests;

    @FindBy(xpath = "//ot-card[@cursor='pointer']/../..//lesson-card[4]")
    public WebElement activityBonus;

    @FindBy(css = "button.otus-button.dark.ng-star-inserted")
    public WebElement lessonSaveAndExit;

    @FindBy(xpath = "//div[@class='ot-modal-container']")
    public WebElement activityModalContainer;
}
