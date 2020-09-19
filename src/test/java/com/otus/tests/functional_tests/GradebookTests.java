package com.otus.tests.functional_tests;

import com.otus.pages.GradebookPage;
import com.otus.pages.LoginPage;
import com.otus.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GradebookTests extends TestBase {


        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        GradebookPage gradebookPage = new GradebookPage();




    @Test(groups = "smoke",
            testName = "Gradebook Page Access",
            description = "Login as student, navigate to Gradebook Page and verify that subtitle is Gradebook")
    public void verifyGradebookPageSubTitle() {

        test = report.createTest("Verify subtitle is Gradebook");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        gradebookPage.navigateTo("Gradebook");
        test.info("Navigated from Home Page to Gradebook Page");
        Assert.assertEquals(gradebookPage.getSubTitle(), "Gradebook");
        test.pass("Subtitle Gradebook was verified");

    }


    @Test
    public void selectStandardsOptionsMasterySetting() {

        test = report.createTest("Verify subtitle is Gradebook");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        gradebookPage.navigateTo("Gradebook");
        test.info("Navigated from Home Page to Gradebook Page");
        gradebookPage.standardsButton.click();
        gradebookPage.threeDotsPoints.click();
        gradebookPage.optionMasterySetting.click();
        gradebookPage.masterySettingMostRecent.click();
        test.pass("Most recent is selected");
    }

    @Test
    public void selectStandardsOptionsMasterySetting2() {

        test = report.createTest("Verify subtitle is Gradebook");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        gradebookPage.navigateTo("Gradebook");
        test.info("Navigated from Home Page to Gradebook Page");
        gradebookPage.standardsButton.click();
        gradebookPage.threeDotsPoints.click();
        gradebookPage.optionMasterySetting.click();
        gradebookPage.masterySettingDecayingAverage.click();
        test.pass("Decaying average is selected");
    }
    @Test
    public void selectPointGradingPeriodByYear() {

        test = report.createTest("Verify subtitle is Gradebook");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        gradebookPage.navigateTo("Gradebook");
        test.info("Navigated from Home Page to Gradebook Page");
        gradebookPage.pointButton.click();
        gradebookPage.threeDotsPoints.click();
        gradebookPage.gradingPeriod.click();
        gradebookPage.gradingPeriodByYear.click();
        test.pass("grading period by year is selected");

        }
    @Test
    public void gradingPeriodOne() {

        test = report.createTest("Verify subtitle is Gradebook");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        gradebookPage.navigateTo("Gradebook");
        test.info("Navigated from Home Page to Gradebook Page");
        gradebookPage.pointButton.click();
        gradebookPage.threeDotsPoints.click();
        gradebookPage.gradingPeriod.click();
        gradebookPage.gradingPeriodOne.click();
        test.pass("grading period one is selected");
    }

    @Test
    public void gradingPeriodTwo() {

        test = report.createTest("Verify subtitle is Gradebook");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        gradebookPage.navigateTo("Gradebook");
        test.info("Navigated from Home Page to Gradebook Page");
        gradebookPage.pointButton.click();
        gradebookPage.threeDotsPoints.click();
        gradebookPage.gradingPeriod.click();
        gradebookPage.gradingPeriodTwo.click();

        test.pass("grading period two is selected");

    } @Test
    public void gradingPeriodThree() {

        test = report.createTest("Verify subtitle is Gradebook");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        gradebookPage.navigateTo("Gradebook");
        test.info("Navigated from Home Page to Gradebook Page");
        gradebookPage.pointButton.click();
        gradebookPage.threeDotsPoints.click();
        gradebookPage.gradingPeriod.click();
        gradebookPage.gradingPeriodThree.click();
        test.pass("grading period three is selected");
    }

    @Test
        public void gradingPeriodFour() {

         test = report.createTest("Verify subtitle is Gradebook");
         mainPage.clickLoginButton();
         test.info("Navigated from Main Page to Login Page");
         loginPage.loginAsStudent();
         test.info("Logged in as student");
         gradebookPage.navigateTo("Gradebook");
         test.info("Navigated from Home Page to Gradebook Page");
         gradebookPage.pointButton.click();
         gradebookPage.threeDotsPoints.click();
         gradebookPage.gradingPeriod.click();
         gradebookPage.gradingPeriodFour.click();
        test.pass("grading period four is selected");



}

        @Test
    public void selectPointsGradingPeriodByIndex(){

            test = report.createTest("Verify subtitle is Gradebook");
            mainPage.clickLoginButton();
            test.info("Navigated from Main Page to Login Page");
            loginPage.loginAsStudent();
            test.info("Logged in as student");
            gradebookPage.navigateTo("Gradebook");
            test.info("Navigated from Home Page to Gradebook Page");
            gradebookPage.pointButton.click();
            gradebookPage.threeDotsPoints.click();
            gradebookPage.gradingPeriod.click();

            //you can choose from 0-4
            gradebookPage.gradingPeriodOptions.get(3).click();
            test.pass("grading period by index selected");
        }

}