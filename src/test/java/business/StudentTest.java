package business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

    // Test constructor and getter methods
    @Test
    public void testConstructorAndGetters() {
        Student student = new Student("S001", "John Doe", "CS", 2023);

        // Verify all fields are initialized correctly
        assertEquals("S001", student.getStudentId());
        assertEquals("John Doe", student.getName());
        assertEquals("CS", student.getMajor());
        assertEquals(2023, student.getEnrollmentYear());
        assertTrue(student.getCompletedCourses().isEmpty());
    }

    // Test setter methods for updating student information
    @Test
    public void testSetters() {
        Student student = new Student("S001", "John", "CS", 2023);

        // Update values
        student.setName("Ali");
        student.setMajor("IT");

        // Verify updated values
        assertEquals("Ali", student.getName());
        assertEquals("IT", student.getMajor());
    }

    // Test adding a completed course
    @Test
    public void testAddCompletedCourse() {
        Student student = new Student("S001", "John", "CS", 2023);

        student.addCompletedCourse("itcs113");

        // Verify course was added
        assertTrue(student.getCompletedCourses().contains("itcs113"));
    }

    // Test preventing duplicate completed courses
    @Test
    public void testAddCompletedCourseNoDuplicate() {
        Student student = new Student("S001", "John", "CS", 2023);

        student.addCompletedCourse("itcs113");
        student.addCompletedCourse("itcs113"); // duplicate

        // Ensure only one instance is stored
        assertEquals(1, student.getCompletedCourses().size());
    }

    // Test setting a list of completed courses
    @Test
    public void testSetCompletedCourses() {
        Student student = new Student("S001", "John", "CS", 2023);

        List<String> courses = Arrays.asList("itcs113", "itcs214");
        student.setCompletedCourses(courses);

        // Verify list size
        assertEquals(2, student.getCompletedCourses().size());
    }

    // Test toString method output
    @Test
    public void testToString() {
        Student student = new Student("S001", "John", "CS", 2023);

        String result = student.toString();

        // Check that important details are included
        assertTrue(result.contains("S001"));
        assertTrue(result.contains("John"));
    }
}