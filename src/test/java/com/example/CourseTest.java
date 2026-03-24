package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    void testGetCourseId() {
        Course course = new Course("ITCS113", "Java 1 Programming", 3, "None");
        assertEquals("ITCS113", course.getCourseId());
    }

    @Test
    void testGetCourseDetails() {
        Course course = new Course("ITCS113", "Java 1 Programming", 3, "None");

        String expected = "Course Details:\n"
                + "Course ID: ITCS113\n"
                + "Course Name: Java 1 Programming\n"
                + "Credit Hours: 3\n"
                + "Prerequisite: None";

        assertEquals(expected, course.getCourseDetails());
    }
}