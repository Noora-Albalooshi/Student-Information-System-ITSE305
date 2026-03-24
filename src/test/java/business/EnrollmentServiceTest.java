package business;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EnrollmentServiceTest {

    // Test successful enrollment when all conditions are met
    @Test
    public void testEnrollSuccess() {
        EnrollmentService service = new EnrollmentService();

        EnrollmentService.EnrollmentResult result =
                service.enrollInCourse("S001", "itcs214"); 

        // Expect success
        assertTrue(result.isSuccess());
    }

    // Test behavior when course does not exist
    @Test
    public void testCourseNotFound() {
        EnrollmentService service = new EnrollmentService();

        EnrollmentService.EnrollmentResult result =
                service.enrollInCourse("S001", "fake101");

        // Expect failure with appropriate message
        assertFalse(result.isSuccess());
        assertTrue(result.getMessage().contains("Course not found"));
    }

    // Test enrolling in a course already completed by the student
    @Test
    public void testAlreadyCompletedCourse() {
        EnrollmentService service = new EnrollmentService();

        // Student has already completed itcs113
        EnrollmentService.EnrollmentResult result =
                service.enrollInCourse("S001", "itcs113");

        // Expect failure due to duplicate completion
        assertFalse(result.isSuccess());
        assertTrue(result.getMessage().contains("already completed"));
    }

    // Test when prerequisites are not satisfied
    @Test
    public void testPrerequisitesNotMet() {
        EnrollmentService service = new EnrollmentService();

        // Course requires prerequisite that student hasn't completed
        EnrollmentService.EnrollmentResult result =
                service.enrollInCourse("S001", "itcs347");

        // Expect failure due to missing prerequisites
        assertFalse(result.isSuccess());
        assertTrue(result.getMessage().contains("Prerequisites not met"));
    }

    // Test enrolling in the same course twice
    @Test
    public void testDuplicateEnrollment() {
        EnrollmentService service = new EnrollmentService();

        // First enrollment attempt
        service.enrollInCourse("S001", "itcs214");

        // Second attempt (duplicate)
        EnrollmentService.EnrollmentResult result =
                service.enrollInCourse("S001", "itcs214");

        // Expect failure due to already being enrolled
        assertFalse(result.isSuccess());
        assertTrue(result.getMessage().contains("already enrolled"));
    }

    // Test behavior when no seats are available
    @Test
    public void testNoSeatsAvailable() {
        EnrollmentService service = new EnrollmentService();

        // Fill all available seats
        for (int i = 0; i < 30; i++) {
            service.enrollInCourse("S00" + i, "itcs285");
        }

        // Try enrolling another student
        EnrollmentService.EnrollmentResult result =
                service.enrollInCourse("S999", "itcs285");

        // Expect failure due to full capacity
        assertFalse(result.isSuccess());
    }
}