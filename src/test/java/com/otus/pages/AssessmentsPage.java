package com.otus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssessmentsPage extends PageBase{

    @FindBy(xpath = "//p[text()='Assessments']")
    private WebElement subTitle;

    @FindBy(xpath = "//td[text()='Tech Challenge - Student Profile']")
    public WebElement techChallengeStudProf;

    @FindBy(xpath ="//td[text()='Tech Challenge - Integration Test Automation']" )
    public WebElement techChallengeIntTestAut;

    @FindBy(xpath = "//button[@class='otus-button dark ng-star-inserted']")
    public WebElement IntTestAutStartButton;

    @FindBy(xpath = "//div//textarea[@spellcheck='false']")
    public WebElement IntegTestAutTextBox;

    @FindBy(css = ".otus-button.dark.exit.ng-star-inserted")
    public WebElement saveAndExit;

    @FindBy(xpath = "//td[text()='Tech Challenge - Functional Test Automation']")
    public WebElement techChallengeFuncTestAut;

    @FindBy(xpath ="//div[@role='dialog' and @aria-hidden='false']//div[@class='otus-new-modal__wrapper'] ")
    public WebElement asseementTitleModalBox;


    public String getSubTitle(){
        return subTitle.getText();
    }

}
