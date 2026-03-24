package presentation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;

public class EnrollmentUITest {

    // Test that the UI starts and exits without crashing
    @Test
    public void testStartMethodRunsWithoutCrash() {

        // Simulate user input: choosing option 3 (Exit)
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        EnrollmentUI ui = new EnrollmentUI();

        // Verify that the application runs without throwing any exceptions
        assertDoesNotThrow(() -> ui.start());
    }
}