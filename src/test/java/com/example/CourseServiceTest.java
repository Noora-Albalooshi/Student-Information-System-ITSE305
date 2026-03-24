package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseServiceTest {

    @Test
    void testAddCourseSuccess() {
        CourseService service = new CourseService();

        Course course = service.addCourse("ITCS113", "Java 1 Programming", 3, "None");

        assertNotNull(course);
        assertEquals("ITCS113", course.getCourseId());
    }

    @Test
    void testEmptyIdThrowsException() {
        CourseService service = new CourseService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.addCourse("", "Java 1 Programming", 3, "None");
        });
    }

    @Test
    void testNullIdThrowsException() {
        CourseService service = new CourseService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.addCourse(null, "Java 1 Programming", 3, "None");
        });
    }

    @Test
    void testInvalidCreditThrowsException() {
        CourseService service = new CourseService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.addCourse("ITCS113", "Java 1 Programming", 0, "None");
        });
    }

    @Test
    void testNegativeCreditThrowsException() {
        CourseService service = new CourseService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.addCourse("ITCS114", "Java 2 Programming", -1, "ITCS113");
        });
    }

    @Test
    void testDuplicateIdThrowsException() {
        CourseService service = new CourseService();

        service.addCourse("ITCS113", "Java 1 Programming", 3, "None");

        assertThrows(IllegalArgumentException.class, () -> {
            service.addCourse("ITCS113", "Java 1 Programming", 3, "None");
        });
    }
}