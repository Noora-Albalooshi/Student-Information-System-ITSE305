package data;

import business.Course;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;

public class CourseRepositoryTest {

    // Test retrieving a course by its code
    @Test
    public void testFindCourseByCode() {
        CourseRepository repo = new CourseRepository();

        Course course = repo.findCourseByCode("itcs113");

        // Verify course exists and code matches
        assertNotNull(course);
        assertEquals("itcs113", course.getCourseCode());
    }

    // Test retrieving all available courses
    @Test
    public void testGetAllCourses() {
        CourseRepository repo = new CourseRepository();

        Collection<Course> courses = repo.getAllCourses();

        // Expect total number of predefined courses
        assertEquals(4, courses.size());
    }

    // Test successful student enrollment in a course
    @Test
    public void testEnrollStudentSuccess() {
        CourseRepository repo = new CourseRepository();

        boolean result = repo.enrollStudent("S001", "itcs113");

        // Expect enrollment to succeed
        assertTrue(result);
    }

    // Test duplicate enrollment prevention
    @Test
    public void testEnrollStudentDuplicate() {
        CourseRepository repo = new CourseRepository();

        repo.enrollStudent("S001", "itcs113");
        boolean result = repo.enrollStudent("S001", "itcs113");

        // Expect failure since student is already enrolled
        assertFalse(result);
    }

    // Test enrollment when course does not exist
    @Test
    public void testEnrollStudentCourseNotFound() {
        CourseRepository repo = new CourseRepository();

        boolean result = repo.enrollStudent("S001", "fake101");

        // Expect failure due to invalid course code
        assertFalse(result);
    }

    // Test checking if a student is enrolled in a course
    @Test
    public void testIsStudentEnrolled() {
        CourseRepository repo = new CourseRepository();

        repo.enrollStudent("S001", "itcs113");

        boolean enrolled = repo.isStudentEnrolled("S001", "itcs113");

        // Expect true since student was enrolled
        assertTrue(enrolled);
    }

    // Test retrieving all enrollments for a specific student
    @Test
    public void testGetStudentEnrollments() {
        CourseRepository repo = new CourseRepository();

        repo.enrollStudent("S001", "itcs113");

        List<String> enrollments = repo.getStudentEnrollments("S001");

        // Verify enrollment list contains correct course
        assertEquals(1, enrollments.size());
        assertTrue(enrollments.contains("itcs113"));
    }
}