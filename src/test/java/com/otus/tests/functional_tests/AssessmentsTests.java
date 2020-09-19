package com.otus.tests.functional_tests;

import com.otus.pages.AssessmentsPage;
import com.otus.pages.LoginPage;
import com.otus.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssessmentsTests extends TestBase {
         MainPage mainPage = new MainPage();
         LoginPage loginPage = new LoginPage();
         AssessmentsPage assessmentsPage = new AssessmentsPage();


    @Test(groups = "smoke",
            testName = "Assessment Page Access",
            description = "Login as student, navigate to Assessments Page and verify that subtitle is Assessments")
    public void verifyPageSubTitle() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        AssessmentsPage assessmentsPage = new AssessmentsPage();

        test = report.createTest("Verify subtitle is Assessments");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        assessmentsPage.navigateTo("Assessments");
        test.info("Navigated from Home Page to Assessments Page");
        Assert.assertEquals(assessmentsPage.getSubTitle(), "Assessments");
        test.pass("Subtitle Assessments was verified");
    }

    @Test(groups = "smoke",
            testName = "Accessing Tech Challenge- Student Profile",
            description = "Assessments module/accessing and starting 'Tech Challnege-Student Profile'")
    public void clickOnTheTechChallengeStProfile() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        AssessmentsPage assessmentsPage = new AssessmentsPage();

        test = report.createTest("Accessing Tech Challenge- Student Profile");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        assessmentsPage.navigateTo("Assessments");
        test.info("Navigated from Home Page to Assessments Page");
        assessmentsPage.techChallengeStudProf.click();
        test.info("Click on Tech Challenge- Student Profile");

        Assert.assertTrue(assessmentsPage.asseementTitleModalBox.isDisplayed());
        test.pass("Accessing Tech Challenge- Student Profile is verified");
    }

    @Test(groups = "smoke",
            testName = "Accessing Tech Challenge- Integration Test Automation'",
            description = "Assessments module/accessing and starting 'Tech Challenge - Integration Test Automation'")
    public void clickOnTheTechChallengeIntegTestAutom() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        AssessmentsPage assessmentsPage = new AssessmentsPage();

        test = report.createTest("Accessing Tech Challenge- Integration Test Automation");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        assessmentsPage.navigateTo("Assessments");
        test.info("Navigated from Home Page to Assessments Page");
        assessmentsPage.techChallengeIntTestAut.click();
        test.info("Click on 'Tech Challenge - Integration Test Automation'");

        Assert.assertTrue(assessmentsPage.asseementTitleModalBox.isDisplayed());
        test.pass("Accessing Tech Challenge- Integration Test Automation is verified");
    }

    @Test(groups = "smoke",
            testName = "Accessing Tech Challenge- Functional Test Automation",
            description = "Assessments module/accessing and starting 'Tech Challenge - Functional Test Automation")
    public void clickOnTheTechChallengeFuncTestAutom() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        AssessmentsPage assessmentsPage = new AssessmentsPage();

        test = report.createTest("Accessing Tech Challenge- Functional Test Automation");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        assessmentsPage.navigateTo("Assessments");
        test.info("Navigated from Home Page to Assessments Page");
        assessmentsPage.techChallengeFuncTestAut.click();
        test.info("Click on ''Tech Challenge - Functional Test Automation''");

        Assert.assertTrue(assessmentsPage.asseementTitleModalBox.isDisplayed());
        test.pass("Accessing Tech Challenge- Functional Test Automation is verified");
    }

    @Test(groups = "smoke",
            testName = "Accessing Tech Challenge- Integration Test Automation and save and exit",
            description = "Assessments module/Save&Exit  'Tech Challenge - Integration Test Automation' assignment")
    public void TechChallengeIntegTestAutomSaveAndExit() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        AssessmentsPage assessmentsPage = new AssessmentsPage();

        test = report.createTest("Verify subtitle is Assessments");
        mainPage.clickLoginButton();
        test.info("Navigated from Main Page to Login Page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        assessmentsPage.navigateTo("Assessments");
        test.info("Navigated from Home Page to Assessments Page");
        assessmentsPage.techChallengeIntTestAut.click();
        test.info("Click on 'Tech Challenge - Integration Test Automation'");
        assessmentsPage.IntTestAutStartButton.click();

        assessmentsPage.saveAndExit.click();

}}