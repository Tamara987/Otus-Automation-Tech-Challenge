package com.otus.tests.functional_tests;

import com.otus.pages.LoginPage;
import com.otus.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


    @Test(  groups = "smoke",
            testName = "Login as Student",
            description = "Login as student and verify that username is equals to Tamara")
    public void verifyUsername() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        test = report.createTest("Verify username");
        mainPage.clickLoginButton();
        test.info("Navigated from main page to login page");
        loginPage.loginAsStudent();
        test.info("Logged in as student");
        Assert.assertEquals(loginPage.getUserName(), "Tamara");
        test.pass("Username Tamara was verified");
    }
}
