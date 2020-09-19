package com.otus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookshelfPage extends PageBase {

    @FindBy(xpath = "//span[text()='Shared With Me']")
    public WebElement sharedWithMeTab;

    @FindBy(xpath = "//span[text()='My Bookshelf']")
    public WebElement myBookshelfTab;

    @FindBy(xpath = "//span[text()='Google Drive']")
    public WebElement googleDriveTab;

    @FindBy(xpath = "//input[@id='file-1']")
    public WebElement inputFile;

    @FindBy(xpath = "//div[@class='ellipses-button']")
    public WebElement addResourceButton;

    @FindBy(xpath = "//span[text()='Resource']")
    public WebElement resourceButton;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[1]")
    public WebElement addFile;
    @FindBy(xpath = "//otus-button[@buttontext='Browse']")
    public WebElement browse;
    @FindBy(xpath = "//input[@class='inputfile']")
    public WebElement inputFile1;
    @FindBy(xpath = "//div//otus-button[@buttontext='Save' and @icon='fa-save']//button[1]")
    public WebElement saveFile;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[2]")
    public WebElement addLink;
    @FindBy(xpath= "//div[@class='attach-link__content-input']//input[@type='text']")
    public WebElement addLinkText;
    @FindBy(css = ".otus-button.icon-button.dark.attach-link__save.ng-star-inserted>.pad")
    public WebElement saveLink;
    @FindBy(xpath = "//div[@class='row']//input[@type='text' and @spellcheck='true'][1]")
    public WebElement linkNameTextBox;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[3]")
    public WebElement addPhoto;
    @FindBy(css = "otus-button[buttontext='Take a Photo']>button.otus-button.icon-button.dark.ng-star-inserted")
    public WebElement takePhotoButton;
    @FindBy(xpath = "//div[@class='ng-star-inserted']//ot-attach-take-photo//div[2]//otus-button//button")
    public WebElement takePhotoButton2;
    @FindBy(xpath = "//otus-button[@buttontext='Save']//button[1]")
    public WebElement savePhoto;
    @FindBy(xpath = "//input[@class='inputfile']")
    public WebElement browseAPhoto;
    @FindBy(css = ".row.margin-top-30.margin-bottom-50.ng-star-inserted>otus-button[buttontext='Save']>button")
    public WebElement savePhoto1;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[4][1]")
    public WebElement addVideo;
    @FindBy(xpath = "//span[@class='otus-button-text' and contains(text(), 'Browse')]")
    public WebElement browseVideoOrPhoto;
    @FindBy(xpath = "//span[@class='otus-button-text' and contains(text(), ' Record Video')]")
    public WebElement recordVideo;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[5][1]")
    public WebElement addYouTubeVideoLink;
    @FindBy(xpath = ".ng-pristine.ng-valid.ng-touched]")
    public WebElement youTubeVideoLinkTextbox;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[6][1]")
    public WebElement addAudio;
    @FindBy(xpath = "//span[contains(text(), 'Browse ')]/..")
    public WebElement addAudioBrowse;
    @FindBy(xpath = "//span[contains(text(), ' Record Audio')]/..")
    public WebElement recordAudioButton;


    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[7][1]")
    public WebElement addFromGoogleDrive;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[8][1]")
    public WebElement addFromOneDrive;
    @FindBy(xpath = "//span[contains(text(), ' Get OneDrive Resources ')]/..")
    public WebElement getOneDriveResource;

    @FindBy(xpath = "//div[@class='attach-wrapper']//div//div[9]")
    public WebElement addPage;
    @FindBy(xpath = "//span[contains(text(), 'Next')]/..")
    public WebElement addPageNextButton;

    public String getTabName(String tab) {

        switch (tab) {
            case "Shared With Me":
                return sharedWithMeTab.getText();
            case "My Bookshelf":
                return myBookshelfTab.getText();
            case "Google Drive":
                return googleDriveTab.getText();
            default:
                throw new RuntimeException("Wrong tab name!");
        }
    }
}
