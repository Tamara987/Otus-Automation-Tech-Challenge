package com.otus.tests.functional_tests;

import com.otus.pages.LessonsPage;
import com.otus.pages.LoginPage;
import com.otus.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LessonsTests extends TestBase {


    @Test(groups = "smoke",
            testName = "Lessons Page Access",
            description = "Login as student, navigate to Lessons Page and verify that subtitle is Lessons")
    public void verifyPageSubTitle() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        LessonsPage lessonsPage = new LessonsPage();
        test = report.createTest("Verify subtitle is Lessons");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        lessonsPage.navigateTo("Lessons");
        test.info("Navigated from Home Page to Lessons Page");
        Assert.assertEquals(lessonsPage.getSubTitle(), "Lessons");
        test.pass("Subtitle Lessons was verified");
    }

    @Test(groups = "smoke",
            testName = "Lessons Page Access and clicking on Lesson and activity Test Plan",
            description = "Login as student, navigate to Lessons Page, click on the lesson, " +
                    "click on activity Test Plan and verify that modal box is displayed")
    public void clickOnLessonAndActivityTestPlan() throws InterruptedException {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        LessonsPage lessonsPage = new LessonsPage();
        test = report.createTest("Verify subtitle is Lessons");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        lessonsPage.navigateTo("Lessons");
        test.info("Navigated from Home Page to Lessons Page");
        lessonsPage.lessonTitle.click();
        test.info("Click on the lesson");
        lessonsPage.activityTestPlan.click();
        Assert.assertTrue(lessonsPage.activityModalContainer.isDisplayed());
        test.pass("Activity Test Plan is displayed");

    }

    @Test(groups = "smoke",
            testName = "Lessons Page Access and clicking on Lesson and activity Functional Tests",
            description = "Login as student, navigate to Lessons Page, click on the lesson, " +
                    "click on activity Functional Tests and verify that modal box is displayed")
    public void clickOnLessonAndActivityFunctionalTests() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        LessonsPage lessonsPage = new LessonsPage();
        test = report.createTest("Verify subtitle is Lessons");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        lessonsPage.navigateTo("Lessons");
        test.info("Navigated from Home Page to Lessons Page");

        lessonsPage.lessonTitle.click();
        test.info("Click on the lesson");
        lessonsPage.activityFunctionalTests.click();
        Assert.assertTrue(lessonsPage.activityModalContainer.isDisplayed());
        test.pass("Activity Functional Test is displayed");

    }

    @Test(groups = "smoke",
            testName = "Lessons Page Access and clicking on Lesson and activity Integration Tests",
            description = "Login as student, navigate to Lessons Page, click on the lesson, " +
                    "click on activity Integration Tests and verify that modal box is displayed")
    public void clickOnLessonAndActivityIntegrationTests() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        LessonsPage lessonsPage = new LessonsPage();
        test = report.createTest("Verify subtitle is Lessons");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        lessonsPage.navigateTo("Lessons");
        test.info("Navigated from Home Page to Lessons Page");

        lessonsPage.lessonTitle.click();
        test.info("Click on the lesson");
        lessonsPage.activityIntegrationTests.click();
        Assert.assertTrue(lessonsPage.activityModalContainer.isDisplayed());
        test.pass("Activity Integration Tests is displayed");

    }

    @Test(groups = "smoke",
            testName = "Lessons Page Access and clicking on Lesson and  activity Bonus",
            description = "Login as student, navigate to Lessons Page, click on the lesson, " +
                    "click on activity Bonus and verify that modal box is displayed")
    public void clickOnLessonAndActivityBonus() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        LessonsPage lessonsPage = new LessonsPage();
        test = report.createTest("Verify subtitle is Lessons");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        lessonsPage.navigateTo("Lessons");
        test.info("Navigated from Home Page to Lessons Page");

        lessonsPage.lessonTitle.click();
        test.info("Click on the lesson");
        lessonsPage.activityBonus.click();
        Assert.assertTrue(lessonsPage.activityModalContainer.isDisplayed());
        test.pass("Activity Bonus is displayed");

    }

    @Test(groups = "smoke",
            testName = "Lessons Page Access and clicking on Lesson and click on Save and Exit",
            description = "Login as student, navigate to Lessons Page, click on the lesson, " +
                    "click on Save and Exit and verify that ")
    public void clickOnLessonSaveandExit() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        LessonsPage lessonsPage = new LessonsPage();
        test = report.createTest("Verify subtitle is Lessons");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        lessonsPage.navigateTo("Lessons");
        test.info("Navigated from Home Page to Lessons Page");

        lessonsPage.lessonTitle.click();
        test.info("Click on the lesson");
        lessonsPage.lessonSaveAndExit.click();
        test.info("verify it goes back to Lessons page");
        Assert.assertEquals(lessonsPage.getSubTitle(), "Lessons");
        test.pass("Subtitle Lessons was verified");
    }
}
