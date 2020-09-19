package com.otus.tests.functional_tests;

import com.otus.pages.ClassesPage;
import com.otus.pages.LoginPage;
import com.otus.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassesTests extends TestBase{


    @Test(  groups = "smoke",
            testName = "Classes Page Access",
            description = "Login as student, navigate to Classes Page and verify that subtitle is Classes")
    public void verifyPageSubTitle() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        ClassesPage classesPage = new ClassesPage();
        test = report.createTest("Verify subtitle is Classes");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        classesPage.navigateTo("Classes");
        test.info("Navigated from Home Page to Classes Page");
        Assert.assertEquals(classesPage.getSubTitle(), "Classes");
        test.pass("Subtitle Classes was verified");
    }

    @Test(  groups ="smoke",
            testName = "Classes Page Access and commenting",
            description = "Login as student, navigate to Classes Page, click on QA Challenge and comment ")
    public void saveComment() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        ClassesPage classesPage = new ClassesPage();
        test = report.createTest("Verify subtitle is Classes");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        classesPage.navigateTo("Classes");
        test.info("Navigated from Home Page to Classes Page");
        classesPage.qaTechChallengeBox.click();
        test.info("Clicked on QA Texh Challenge Box");
        classesPage.welcomeBox.click();
        test.info("Welcome box is clicked");
        classesPage.comment.click();
        test.info("Comment button clicked");
        classesPage.textArea.sendKeys("QA");
        test.info("Comment text entered");
        classesPage.saveCommentButton.click();
        test.pass("Comment saved");
    }
    @Test(  groups ="smoke",
            testName = "Classes Page Access and deleting comment",
            description = "Login as student, navigate to Classes Page, click on QA Challenge and delete comment ")

    public void deleteComment() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        ClassesPage classesPage = new ClassesPage();
        test = report.createTest("Verify subtitle is Classes");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        classesPage.navigateTo("Classes");
        test.info("Navigated from Home Page to Classes Page");
        classesPage.qaTechChallengeBox.click();

        Assert.assertTrue(classesPage.welcomeBox.isDisplayed());
        classesPage.welcomeBox.click();
        test.info("Welcome box displayed");
        classesPage.deleteIcon.click();
        test.info("Delete icon clicked");
        classesPage.confirmDelete.click();
        test.info("Delete confirmed");
        test.pass("Comment Deleted");
    }
    @Test(  groups ="smoke",
            testName = "Classes Page Access and Join Class",
            description = "Login as student, navigate to Classes Page, click on Join Class ")

    public void joinClass() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        ClassesPage classesPage = new ClassesPage();
        test = report.createTest("Verify subtitle is Classes");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        classesPage.navigateTo("Classes");
        test.info("Navigated from Home Page to Classes Page");
        classesPage.joinClassButton.click();
        test.info("Click on Join Class");

        Assert.assertTrue(classesPage.joinClassModalBox.isDisplayed());
        test.pass("Join Class modal box is displayed");
    }


}



