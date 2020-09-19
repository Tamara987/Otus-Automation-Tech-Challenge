package com.otus.tests.integration_tests;


import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.util.List;

public class IntegrationTests {

    String path = System.getProperty("user.dir") + File.separator + "studentclass.json";
    File jsonFile = new File(path);
    JsonPath jsonPath = new JsonPath(jsonFile);
    List<Student> studentList = jsonPath.getList("students", Student.class);

    @DisplayName("Get all Names")
    @Test
    public void getNames() {
        for (Student eachStudent : studentList) {
            Assert.assertTrue(Matchers.notNullValue().matches(eachStudent.getFirstName()));
            System.out.println(eachStudent.getFirstName());
        }
    }

    @DisplayName("Get all Emails")
    @Test
    public void getEmails() {
        for (Student eachStudent : studentList) {
            Assert.assertTrue(Matchers.notNullValue().matches(eachStudent.getEmail()));
            System.out.println(eachStudent.getFirstName() + " = " + eachStudent.getEmail());
        }
    }

    @DisplayName("Get all GPAs")
    @Test
    public void getGPAs() {
        for (Student eachStudent : studentList) {
            double gpa = 0;
            int count = 0;
            for (StudentClasses studentClasses : eachStudent.getStudentClasses()) {
                count++;
                gpa += studentClasses.getGrade();
            }
            gpa = gpa / count;

            System.out.println(eachStudent.getFirstName() + "'s GPA = " + gpa);
        }
    }

    @DisplayName("Get all Courses")
    @Test
    public void getCourses() {

        Courses allCourses = jsonPath.getObject("classes", Courses.class);
        System.out.println(allCourses);
    }

    String path2 = System.getProperty("user.dir") + File.separator + "jsonresponse.json";
    File jsonFile2 = new File(path2);
    JsonPath jsonPath2 = new JsonPath(jsonFile2);





    @Test(testName = "District Id Check",
            description = "District Id should be equal to 85623")
    public void districtIdCheck() {
        SoftAssert softAssertion = new SoftAssert();

        List<Assessment> assessmentList = jsonPath2.getList("data.AssessmentSearch", Assessment.class);

        for (Assessment each : assessmentList) {
            softAssertion.assertEquals(each.getDistrict_id(), Integer.valueOf(85623));
        }
        softAssertion.assertAll();
    }


    @Test(testName = "District Id Check2",
            description = "District Id check with invalid id (not 85623)")
    public void districtIdCheck2() {

        SoftAssert softAssertion = new SoftAssert();

        List<Assessment> assessmentList = jsonPath2.getList("data.AssessmentSearch", Assessment.class);

        for (Assessment each : assessmentList) {
            softAssertion.assertNotEquals(each.getDistrict_id(), Integer.valueOf(11111));
        }
        softAssertion.assertAll();

    }


    @Test(testName = "Assessment Type Validation",
            description = "Assessment Type should be 3 or 2")
    public void assessmentTypeValidation() {

        SoftAssert softAssertion = new SoftAssert();

        List<Assessment> assessmentList = jsonPath2.getList("data.AssessmentSearch", Assessment.class);

        for (Assessment each : assessmentList) {
            softAssertion.assertTrue(each.getAssessment_type() == 3 || each.getAssessment_type() == 2);
        }
        softAssertion.assertAll();

    }

    @Test(testName = "Assessment Type Validation",
            description = "Assessment Type validation with invalid number")
    public void assessmentTypeValidation2() {

        SoftAssert softAssertion = new SoftAssert();

        List<Assessment> assessmentList = jsonPath2.getList("data.AssessmentSearch", Assessment.class);

        for (Assessment each : assessmentList) {
            softAssertion.assertFalse(each.getAssessment_type() > 3 || each.getAssessment_type() < 2);
        }
        softAssertion.assertAll();

    }

    @Test(testName = "Grading scale Validation",
            description = "grading_scale_id should be 751")
    public void gradingScaleValidation() {

        SoftAssert softAssertion = new SoftAssert();

        List<Assessment> assessmentList = jsonPath2.getList("data.AssessmentSearch", Assessment.class);

        for (Assessment each : assessmentList) {
            softAssertion.assertTrue(each.getGrading_scale_id() == 751);
        }
        softAssertion.assertAll();

    }
    @Test(testName = "Grading scale Validation with invalid input",
            description = "grading_scale_id not 751")
    public void gradingScaleValidationInvalidInput() {

        SoftAssert softAssertion = new SoftAssert();

        List<Assessment> assessmentList = jsonPath2.getList("data.AssessmentSearch", Assessment.class);

        for (Assessment each : assessmentList) {
            softAssertion.assertFalse(each.getGrading_scale_id() <751 || each.getGrading_scale_id() >751);
        }
        softAssertion.assertAll();
}
        @Test(testName = "Response size and assessment_id: 202089",
                description = "response for assessment_id: 202089")
        public void jsonResponseSizeAndAssessment_id202089(){

            int count =jsonPath2.getInt("data.AssessmentSearch.size()");
            Assert.assertEquals(count,15);
            int assessment_id=jsonPath2.getInt("data.AssessmentSearch[8].assessment_id");
            String assessment_title=jsonPath2.getString("data.AssessmentSearch[8].assessment_title");
            int assessment_type=jsonPath2.getInt("data.AssessmentSearch[8].assessment_type");
            int district_id=jsonPath2.getInt("data.AssessmentSearch[8].district_id");
            int grading_scale_id=jsonPath2.getInt( "data.AssessmentSearch[8].grading_scale_id");
            String __typename=jsonPath2.getString("data.AssessmentSearch[8].__typename");


            Assert.assertEquals(assessment_id,202089);
            Assert.assertEquals(assessment_title,"PE 3.1 Throwing - Motor Skills & Movement Patterns ");
            Assert.assertEquals(assessment_type,3);
            Assert.assertEquals(district_id,85623);
            Assert.assertEquals(grading_scale_id,751);

        }


    @Test(testName = "Negative test case",
            description = "response validation with invalid input")
    public void jsonResponseValidationwithInvalidData(){

        int count =jsonPath2.getInt("data.AssessmentSearch.size()");

        for (int i = 0; i <count ; i++) {


       Assert.assertNotEquals("data.AssessmentSearch["+i+"].assessment_title", "Otus");
         Assert.assertNotEquals("data.AssessmentSearch["+i+"].assessment_type", 1);
           Assert.assertNotEquals("data.AssessmentSearch["+i+"].assessment_title", 2233);
}} }