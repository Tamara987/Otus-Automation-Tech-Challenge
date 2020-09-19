package com.otus.tests.integration_tests;

/**
 *
 * {
 *         "assessment_id": 264428,
 *         "assessment_title": "Behavior - Social Development 3-5",
 *         "assessment_type": 3,
 *         "district_id": 85623,
 *         "grading_scale_id": 751,
 *         "__typename": "AssessmentSearch"
 *       }
 *
 */



public class Assessment {

    private Integer assessment_id;
    private String assessment_title;
    private Integer assessment_type;
    private Integer district_id;
    private Integer grading_scale_id;
    private String __typename;

    public Integer getAssessment_id() {
        return assessment_id;
    }

    public String getAssessment_title() {
        return assessment_title;
    }

    public Integer getAssessment_type() {
        return assessment_type;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public Integer getGrading_scale_id() {
        return grading_scale_id;
    }

    public String get__typename() {
        return __typename;
    }

    @Override
    public String toString() {
        return "Assessments{" +
                "assessment_id=" + assessment_id +
                ", assessment_title='" + assessment_title + '\'' +
                ", assessment_type=" + assessment_type +
                ", district_id=" + district_id +
                ", grading_scale_id=" + grading_scale_id +
                ", __typename='" + __typename + '\'' +
                '}';
    }
}
