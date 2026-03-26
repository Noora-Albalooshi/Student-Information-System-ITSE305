package submitgrades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {

    @Test
    void testConstructorAndGetters() {
        Grade grade = new Grade("CS101", "S001", "A", true, true);

        assertEquals("CS101", grade.getCourseId());
        assertEquals("S001", grade.getStudentId());
        assertEquals("A", grade.getFinalGrade());
        assertTrue(grade.isEnrolled());
        assertTrue(grade.isAssessmentsRecorded());
    }

    @Test
    void testGradeDetailsContainsCorrectData() {
        Grade grade = new Grade("CS101", "S001", "A", true, true);

        String details = grade.getGradeDetails();

        assertTrue(details.contains("CS101"));
        assertTrue(details.contains("S001"));
        assertTrue(details.contains("A"));
        assertTrue(details.contains("Academic record updated successfully."));
    }
}