package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseRepositoryTest {

    @Test
    void testAddCourseAndExistsById() {
        CourseRepository repo = new CourseRepository();
        Course course = new Course("ITCS113", "Java 1 Programming", 3, "None");

        repo.addCourse(course);

        assertTrue(repo.existsById("ITCS113"));
    }

    @Test
    void testExistsByIdFalse() {
        CourseRepository repo = new CourseRepository();

        assertFalse(repo.existsById("ITCS999"));
    }

    @Test
    void testExistsIgnoreCase() {
        CourseRepository repo = new CourseRepository();
        Course course = new Course("ITCS113", "Java 1 Programming", 3, "None");

        repo.addCourse(course);

        assertTrue(repo.existsById("itcs113"));
    }
}