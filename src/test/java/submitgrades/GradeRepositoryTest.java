package submitgrades;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradeRepositoryTest {

    @Test
    public void testAddAndExists() {
        GradeRepository repo = new GradeRepository();
        repo.addGrade(new Grade("CS101", "S001", "A", true, true));

        assertTrue(repo.existsByStudentAndCourse("S001", "CS101"));
    }

    @Test
    public void testNotExists() {
        GradeRepository repo = new GradeRepository();

        assertFalse(repo.existsByStudentAndCourse("S002", "CS102"));
    }
}