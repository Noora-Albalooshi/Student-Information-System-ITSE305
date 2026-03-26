import javax.swing.*;
import java.awt.*;

// Presentation layer class responsible for the user interface
public class SubmitGradesUI extends JFrame {
    private JTextField courseIdField;
    private JTextField studentIdField;
    private JTextField finalGradeField;
    private JCheckBox enrolledBox;
    private JCheckBox assessmentsBox;
    private JTextArea outputArea;
    private JButton submitButton;

    // Connects the UI to the business layer
    private GradeService service = new GradeService();

    public SubmitGradesUI() {
        setTitle("Submit Grades");
        setSize(550, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Form panel using GridBagLayout for better alignment
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Course ID:"), gbc);

        gbc.gridx = 1;
        courseIdField = new JTextField(20);
        formPanel.add(courseIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Student ID:"), gbc);

        gbc.gridx = 1;
        studentIdField = new JTextField(20);
        formPanel.add(studentIdField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Final Grade:"), gbc);

        gbc.gridx = 1;
        finalGradeField = new JTextField(20);
        formPanel.add(finalGradeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Enrollment Verified:"), gbc);

        gbc.gridx = 1;
        enrolledBox = new JCheckBox("Yes");
        formPanel.add(enrolledBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(new JLabel("Assessments Recorded:"), gbc);

        gbc.gridx = 1;
        assessmentsBox = new JCheckBox("Yes");
        formPanel.add(assessmentsBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        submitButton = new JButton("Submit Grade");
        formPanel.add(submitButton, gbc);

        // Output area to show confirmation and grade details
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setMargin(new Insets(10, 10, 10, 10));

        add(formPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Reads input from UI and sends it to the business layer
        submitButton.addActionListener(e -> {
            try {
                String courseId = courseIdField.getText();
                String studentId = studentIdField.getText();
                String finalGrade = finalGradeField.getText();
                boolean enrolled = enrolledBox.isSelected();
                boolean assessmentsRecorded = assessmentsBox.isSelected();

                Grade grade = service.submitGrade(
                        courseId,
                        studentId,
                        finalGrade,
                        enrolled,
                        assessmentsRecorded
                );

                outputArea.setText("Grade submitted successfully!\n\n" + grade.getGradeDetails());

            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(),
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    // Starts the Swing application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SubmitGradesUI().setVisible(true));
    }
}