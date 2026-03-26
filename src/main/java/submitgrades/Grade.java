package submitgrades;

public class Grade {
    private String courseId;
    private String studentId;
    private String finalGrade;
    private boolean enrolled;
    private boolean assessmentsRecorded;

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

    public String getFinalGrade() {
        return finalGrade;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public boolean isAssessmentsRecorded() {
        return assessmentsRecorded;
    }

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