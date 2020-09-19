package com.otus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GradebookPage extends PageBase {

    @FindBy(xpath = "//p[text()='Gradebook']")
    private WebElement subTitle;

    @FindBy(xpath = "//button[contains(text(),'Points')]")
    public WebElement pointButton;

    @FindBy(css = ".fa.fa-ellipsis-h")
    public WebElement threeDotsPoints;

    @FindBy(xpath = "//span[text()='Grading Period']")
    public WebElement gradingPeriod;

    @FindBy(xpath = "//button[contains(text(),'Standards')]")
    public WebElement standardsButton;

    @FindBy(xpath = "//span[text()='Filter Standards']")
    public WebElement optionFilterStandards;

    @FindBy(xpath = "//input[@placeholder='Search'][1]")
    public WebElement filterStandardsSearchBox;

    @FindBy(xpath = "//span[text()='Filter Assessments']")
    public WebElement optionFilterAssessments;

    @FindBy(xpath = "//span[text()='Mastery Setting']")
    public WebElement optionMasterySetting;

    @FindBy(xpath = "//div[text()='Most Recent']")
    public WebElement masterySettingMostRecent;

    @FindBy(xpath = "//div[text()='Decaying Average']")
    public WebElement masterySettingDecayingAverage;


    @FindBy(xpath = "//span[text()='Grading Scale']")
    public WebElement optionGradingScale;

    @FindBy(xpath = "//div[text()='Above Mastery, At Mastery, Below Mastery']")
    public WebElement aboveAtBelow;

    @FindBy(xpath = "//div[text()='Always, Usually, Sometimes, Rarely, Never']")
    public WebElement alwUsulSomRarNever;

    @FindBy(xpath = "//div[text()='Mastery, Near Mastery, Approaching Mastery, Not at Mastery']']")
    public WebElement masteryLevel;

    @FindBy(xpath = "//div[text()='Points']")
    public WebElement gradingScalePoints;

    @FindBy(xpath = "//span[text()='Grading Period']']")
    public WebElement optionGradingPeriod;

    @FindBy(xpath = "//div[@class='option-title' and contains(text(), '2020-2021')]")
    public WebElement gradingPeriodByYear;

    @FindBy(xpath = "//div[@class='option-title' and contains(text(), 'Grading Period 1')]")
    public WebElement gradingPeriodOne;

    @FindBy(xpath = "//div[@class='option-title' and contains(text(), 'Grading Period 2')]")
    public WebElement gradingPeriodTwo;

    @FindBy(xpath = "//div[@class='option-title' and contains(text(), 'Grading Period 3')]")
    public WebElement gradingPeriodThree;

    @FindBy(xpath = "//div[@class='option-title' and contains(text(), 'Grading Period 4')]")
    public WebElement gradingPeriodFour;

    @FindBy(xpath ="//div[@class='option-title']")
    public List< WebElement> gradingPeriodOptions;

    public String getSubTitle(){
        return subTitle.getText();
    }






        }




