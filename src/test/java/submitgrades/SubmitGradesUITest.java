package submitgrades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.SwingUtilities;

public class SubmitGradesUITest {

    @Test
    void testUI() throws Exception {
        final SubmitGradesUI[] ui = new SubmitGradesUI[1];

        SwingUtilities.invokeAndWait(() -> ui[0] = new SubmitGradesUI());

        assertNotNull(ui[0]);
        assertEquals("Submit Grades", ui[0].getTitle());

        ui[0].dispose();
    }
}

