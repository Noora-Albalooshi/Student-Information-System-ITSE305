package submitgrades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    @Test
    void testSuccess() {
        GradeService service = new GradeService();
        Grade g = service.submitGrade("CS101", "S001", "A", true, true);

        assertNotNull(g);
    }

    @Test
    void testDuplicate() {
        GradeService service = new GradeService();
        service.submitGrade("CS101", "S001", "A", true, true);

        assertThrows(IllegalArgumentException.class, () ->
                service.submitGrade("CS101", "S001", "B", true, true));
    }
}