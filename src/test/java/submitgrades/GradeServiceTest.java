package submitgrades;
import org.junit.Test;
import static org.junit.Assert.*;
public class GradeServiceTest {

    @Test
    public void testSuccess() {
        GradeService service = new GradeService();
        Grade g = service.submitGrade("CS101", "S001", "A", true, true);

        assertNotNull(g);
    }

    @Test
    public void testDuplicate() {
        GradeService service = new GradeService();
        service.submitGrade("CS101", "S001", "A", true, true);

        assertThrows(IllegalArgumentException.class, () ->
                service.submitGrade("CS101", "S001", "B", true, true));
    }
}