package com.otus.tests.integration_tests;

/**
 *          {
 *  *           "id": 1,
 *  *           "grade": 4
 *  *         }
 */

public class StudentClasses {
    private Integer id;
    private Double grade;

    public Integer getId() {
        return id;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentClasses{" +
                "id=" + id +
                ", grade=" + grade +
                '}';
    }
}
