package business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseTest {

    // Test constructor and getter methods
    @Test
    public void testConstructorAndGetters() {
        Course course = new Course("itcs113", "Java Programming", 3, 30, new ArrayList<>());

        // Verify all attributes are initialized correctly
        assertEquals("itcs113", course.getCourseCode());
        assertEquals("Java Programming", course.getCourseName());
        assertEquals(3, course.getCredits());
        assertEquals(30, course.getMaxSeats());
        assertEquals(0, course.getCurrentEnrollment());
    }

    // Test setter methods for updating course data
    @Test
    public void testSetters() {
        Course course = new Course("itcs113", "Java", 3, 30, new ArrayList<>());

        // Update values
        course.setCourseName("Advanced Java");
        course.setCredits(4);

        // Verify updated values
        assertEquals("Advanced Java", course.getCourseName());
        assertEquals(4, course.getCredits());
    }

    // Test when seats are available
    @Test
    public void testHasAvailableSeatsTrue() {
        Course course = new Course("itcs113", "Java", 3, 30, new ArrayList<>());

        // Expect true since no students are enrolled yet
        assertTrue(course.hasAvailableSeats());
    }

    // Test when course is full
    @Test
    public void testHasAvailableSeatsFalse() {
        Course course = new Course("itcs113", "Java", 3, 30, new ArrayList<>());

        // Set enrollment equal to max capacity
        course.setCurrentEnrollment(30);

        // Expect false since course is full
        assertFalse(course.hasAvailableSeats());
    }

    // Test calculation of available seats
    @Test
    public void testGetAvailableSeats() {
        Course course = new Course("itcs113", "Java", 3, 30, new ArrayList<>());

        // Simulate 10 students enrolled
        course.setCurrentEnrollment(10);

        // Expect 20 seats remaining
        assertEquals(20, course.getAvailableSeats());
    }

    // Test prerequisites functionality
    @Test
    public void testPrerequisites() {
        Course course = new Course(
            "itcs214",
            "Data Structures",
            3,
            25,
            Arrays.asList("itcs113")
        );

        // Check that prerequisite course exists
        assertTrue(course.getPrerequisites().contains("itcs113"));
    }

    // Test toString method output
    @Test
    public void testToString() {
        Course course = new Course("itcs113", "Java", 3, 30, new ArrayList<>());

        String output = course.toString();

        // Ensure important information is included in string
        assertTrue(output.contains("itcs113"));
        assertTrue(output.contains("Java"));
    }
}