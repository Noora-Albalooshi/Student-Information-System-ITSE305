package submitgrades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeRepositoryTest {

    @Test
    void testRepositoryInitiallyEmpty() {
        GradeRepository repo = new GradeRepository();

        assertFalse(repo.existsByStudentAndCourse("S001", "CS101"));
    }

    @Test
    void testAddGradeAndExistsReturnsTrue() {
        GradeRepository repo = new GradeRepository();
        Grade grade = new Grade("CS101", "S001", "A", true, true);

        repo.addGrade(grade);

        assertTrue(repo.existsByStudentAndCourse("S001", "CS101"));
    }

    @Test
    void testCaseInsensitiveMatching() {
        GradeRepository repo = new GradeRepository();
        repo.addGrade(new Grade("cs101", "s001", "A", true, true));

        assertTrue(repo.existsByStudentAndCourse("S001", "CS101"));
    }
}