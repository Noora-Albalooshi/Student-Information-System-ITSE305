// Model class that stores submitted grade information
public class Grade {
    private String courseId;
    private String studentId;
    private String finalGrade;
    private boolean enrolled;
    private boolean assessmentsRecorded;

    // Constructor to initialize grade details
    public Grade(String courseId, String studentId, String finalGrade, boolean enrolled, boolean assessmentsRecorded) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.finalGrade = finalGrade;
        this.enrolled = enrolled;
        this.assessmentsRecorded = assessmentsRecorded;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    // Returns formatted grade details for display
    public String getGradeDetails() {
        return "Grade Submission Details:\n"
                + "Course ID: " + courseId + "\n"
                + "Student ID: " + studentId + "\n"
                + "Final Grade: " + finalGrade + "\n"
                + "Enrollment Verified: " + enrolled + "\n"
                + "Assessments Recorded: " + assessmentsRecorded + "\n"
                + "Academic record updated successfully.";
    }
}