package com.otus.tests.integration_tests;

import com.google.gson.annotations.SerializedName;

/**
 *
 * {
 *     "1": "Math 101",
 *     "2": "English 101",
 *     "3": "Science 101",
 *     "4": "Social Studies 101",
 *     "5": "Health 101",
 *     "6": "Chemistry 101",
 *     "7": "English 201",
 *     "8": "Math 201"
 *   }
 *
 */

public class Courses {
    @SerializedName("1")
    private String first;
    @SerializedName("2")
    private String second;
    @SerializedName("3")
    private String third;
    @SerializedName("4")
    private String forth;
    @SerializedName("5")
    private String fifth;
    @SerializedName("6")
    private String sixth;
    @SerializedName("7")
    private String seventh;
    @SerializedName("8")
    private String eighth;

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

    public String getForth() {
        return forth;
    }

    public String getFifth() {
        return fifth;
    }

    public String getSixth() {
        return sixth;
    }

    public String getSeventh() {
        return seventh;
    }

    public String getEighth() {
        return eighth;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", third='" + third + '\'' +
                ", forth='" + forth + '\'' +
                ", fifth='" + fifth + '\'' +
                ", sixth='" + sixth + '\'' +
                ", seventh='" + seventh + '\'' +
                ", eighth='" + eighth + '\'' +
                '}';
    }
}
