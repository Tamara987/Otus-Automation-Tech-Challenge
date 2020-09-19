package com.otus.tests.integration_tests;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * {
 *       "first": "John",
 *       "last": "Smith",
 *       "email": "johnsmith@mailinator.com",
 *       "studentClasses": [
 *         {
 *           "id": 1,
 *           "grade": 4
 *         },
 *         {
 *           "id": 2,
 *           "grade": 3
 *         },
 *         {
 *           "id": 3,
 *           "grade": 2
 *         },
 *         {
 *           "id": 4,
 *           "grade": 2.5
 *         },
 *         {
 *           "id": 5,
 *           "grade": 3.5
 *         },
 *         {
 *           "id": 6,
 *           "grade": 4
 *         }
 *       ]
 *     }
 */


public class Student {
    @SerializedName("first")
    private String firstName;
    @SerializedName("last")
    private String lastName;
    private String email;
    private List<StudentClasses> studentClasses;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<StudentClasses> getStudentClasses() {
        return studentClasses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", studentClasses=" + studentClasses +
                '}';
    }
}
