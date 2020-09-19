package com.otus.tests.functional_tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.otus.pages.LessonsPage;
import com.otus.pages.LoginPage;
import com.otus.pages.MainPage;
import com.otus.utilities.BrowserUtils;
import com.otus.utilities.ConfigurationReader;
import com.otus.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected static ExtentReports report;
    protected ExtentTest test;
    protected ExtentSparkReporter spark;


    @BeforeTest(alwaysRun = true)
    @Parameters("reportName")
    public synchronized void setupTest(@Optional String reportName) {
        System.out.println("Report name: " + reportName);
        reportName = reportName == null ? "report.html" : reportName + ".html";

        String reportPath = System.getProperty("user.dir") + File.separator + "test-output" + File.separator + reportName;

        report = new ExtentReports();
        spark = new ExtentSparkReporter(reportPath);
        report.attachReporter(spark);
        spark.config().setReportName("OTUS Test Automation Results");
    }





    @AfterTest
    public void afterTest() {
        report.flush();
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown(ITestResult iTestResult) throws IOException {
        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = BrowserUtils.getScreenshot(iTestResult.getName());
            test.fail(iTestResult.getName());
            BrowserUtils.wait(2);
            test.addScreenCaptureFromPath(screenshotPath, "Failed");
            test.fail(iTestResult.getThrowable());
        }
        BrowserUtils.wait(2);
        Driver.closeDriver();
    }


}
