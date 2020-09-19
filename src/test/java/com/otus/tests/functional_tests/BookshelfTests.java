package com.otus.tests.functional_tests;

import com.otus.pages.BookshelfPage;
import com.otus.pages.LoginPage;
import com.otus.pages.MainPage;
import com.otus.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class BookshelfTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    BookshelfPage bookshelfPage = new BookshelfPage();


    @Test(groups = "smoke",
            testName = "Bookshelf Page Access",
            description = "Login as student, navigate to Bookshelf Page and verify that page has My Bookshelf as tab name")
    public void verifyTabName() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        BookshelfPage bookshelfPage = new BookshelfPage();

        test = report.createTest("Verify page has My Bookshelf tab");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        bookshelfPage.navigateTo("Bookshelf");
        test.info("Navigated from Home Page to Bookshelf Page");

        Assert.assertEquals(bookshelfPage.getTabName("My Bookshelf"), "My Bookshelf");
        test.pass("Tab Name My Bookshelf was verified");
    }

    @Test(groups = "smoke",
            testName = "Bookshelf upload File",
            description = "Login as student, navigate to Bookshelf Page and upload File")

    public void uploadFileFromTheFramework() throws InterruptedException {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        BookshelfPage bookshelfPage = new BookshelfPage();

        test = report.createTest("Verify page has My Bookshelf tab");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        bookshelfPage.navigateTo("Bookshelf");
        Thread.sleep(5000);
        test.info("Navigated from Home Page to Bookshelf Page");
        bookshelfPage.myBookshelfTab.click();
        Thread.sleep(5000);
        test.info("Clicking on add resource button");
        bookshelfPage.addResourceButton.click();
        Thread.sleep(5000);
        bookshelfPage.resourceButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3000);
        bookshelfPage.addFile.click();
       bookshelfPage.inputFile1.sendKeys(System.getProperty("user.dir")+ File.separator+"TAMARA_YESAYAN_RESUME (2).docx");
        bookshelfPage.saveFile.click();
    }
    @Test(groups = "smoke",
            testName = "Bookshelf upload File",
            description = "Login as student, navigate to Bookshelf Page and upload File")

    public void uploadFileFromComputer() throws InterruptedException {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        BookshelfPage bookshelfPage = new BookshelfPage();

        test = report.createTest("Verify page has My Bookshelf tab");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        bookshelfPage.navigateTo("Bookshelf");
        Thread.sleep(5000);
        test.info("Navigated from Home Page to Bookshelf Page");
        bookshelfPage.myBookshelfTab.click();
        Thread.sleep(5000);
        test.info("Clicking on add resource button");
        bookshelfPage.addResourceButton.click();
        Thread.sleep(5000);
        bookshelfPage.resourceButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3000);
        bookshelfPage.addFile.click();
        bookshelfPage.inputFile1.sendKeys("C:\\Users\\toma_\\Downloads\\TAMARA_YESAYAN_RESUME (2).docx");
        bookshelfPage.saveFile.click();
    }


    @Test(groups = "smoke",
            testName = "Bookshelf upload Link",
            description = "Login as student, navigate to Bookshelf Page and upload Link")

    public void uploadLink() throws InterruptedException {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        BookshelfPage bookshelfPage = new BookshelfPage();

        test = report.createTest("Verify page has My Bookshelf tab");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        bookshelfPage.navigateTo("Bookshelf");

        test.info("Navigated from Home Page to Bookshelf Page");
        bookshelfPage.myBookshelfTab.click();
        test.info("Clicking on add resource button");

        bookshelfPage.addResourceButton.click();
        bookshelfPage.resourceButton.click();
        bookshelfPage.addLink.click();
        Thread.sleep(3000);

        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),3000);
        wait.until(ExpectedConditions.elementToBeClickable(bookshelfPage.addLinkText)).sendKeys("https://my.otus.com/bookshelf/my-bookshelf");
        bookshelfPage.linkNameTextBox.sendKeys("Otus");
        wait.until(ExpectedConditions.elementToBeClickable(bookshelfPage.saveLink)).click();
        test.pass("Link is added");


    }
    @Test(groups = "smoke",
            testName = "Bookshelf upload Link",
            description = "Login as student, navigate to Bookshelf Page and upload Link")

    public void browsePhoto() throws InterruptedException {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        BookshelfPage bookshelfPage = new BookshelfPage();

        test = report.createTest("Verify page has My Bookshelf tab");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        bookshelfPage.navigateTo("Bookshelf");

        test.info("Navigated from Home Page to Bookshelf Page");
        bookshelfPage.myBookshelfTab.click();
        test.info("Clicking on add resource button");

        bookshelfPage.addResourceButton.click();
        bookshelfPage.resourceButton.click();
        bookshelfPage.addPhoto.click();
        bookshelfPage.browseAPhoto.sendKeys("C:\\Users\\toma_\\Pictures\\2016-03\\DSC00525.JPG");
        bookshelfPage.savePhoto1.click();



    }



}