package submitgrades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    @Test
    void testSubmitGradeSuccess() {
        GradeService service = new GradeService();
        Grade g = service.submitGrade("CS101", "S001", "A", true, true);

        assertNotNull(g);
        assertEquals("CS101", g.getCourseId());
        assertEquals("S001", g.getStudentId());
        assertEquals("A", g.getFinalGrade());
    }

    @Test
    void testEmptyCourseId() {
        GradeService service = new GradeService();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                service.submitGrade("", "S001", "A", true, true));

        assertEquals("Course ID cannot be empty.", ex.getMessage());
    }

    @Test
    void testDuplicateGradeSubmission() {
        GradeService service = new GradeService();
        service.submitGrade("CS101", "S001", "A", true, true);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                service.submitGrade("CS101", "S001", "B", true, true));

        assertEquals("Grade already submitted for this student in this course.", ex.getMessage());
    }
}