package submitgrades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeRepositoryTest {

    @Test
    void testAddAndExists() {
        GradeRepository repo = new GradeRepository();
        repo.addGrade(new Grade("CS101", "S001", "A", true, true));

        assertTrue(repo.existsByStudentAndCourse("S001", "CS101"));
    }

    @Test
    void testNotExists() {
        GradeRepository repo = new GradeRepository();

        assertFalse(repo.existsByStudentAndCourse("S002", "CS102"));
    }
}