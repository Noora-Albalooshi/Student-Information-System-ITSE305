package submitgrades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;

public class SubmitGradesUITest {

    @Test
    public void testUIInitialization() throws Exception {
        final SubmitGradesUI[] ui = new SubmitGradesUI[1];

        SwingUtilities.invokeAndWait(() -> ui[0] = new SubmitGradesUI());

        assertNotNull(ui[0]);
        assertTrue(ui[0] instanceof JFrame);
        assertEquals("Submit Grades", ui[0].getTitle());
        assertEquals(550, ui[0].getWidth());
        assertEquals(420, ui[0].getHeight());
        assertEquals(JFrame.EXIT_ON_CLOSE, ui[0].getDefaultCloseOperation());

        ui[0].dispose();
    }
}