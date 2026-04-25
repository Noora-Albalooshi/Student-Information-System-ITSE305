package submitgrades;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradeTest {

    @Test
    public void testConstructorAndGetters() {
        Grade grade = new Grade("CS101", "S001", "A", true, true);

        assertEquals("CS101", grade.getCourseId());
        assertEquals("S001", grade.getStudentId());
        assertEquals("A", grade.getFinalGrade());
        assertTrue(grade.isEnrolled());
        assertTrue(grade.isAssessmentsRecorded());
    }
}