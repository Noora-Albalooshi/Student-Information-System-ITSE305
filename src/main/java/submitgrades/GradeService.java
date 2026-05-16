package submitgrades;

public class GradeService {

    private GradeRepository repository;

    public GradeService() {
        repository = new GradeRepository();
    }

    private boolean isDuplicateGrade(String studentId, String courseId) {
    return repository.existsByStudentAndCourse(studentId, courseId);
}
    public Grade submitGrade(String courseId, String studentId, String finalGrade,
                             boolean enrolled, boolean assessmentsRecorded) {

        if (courseId == null || courseId.trim().isEmpty()) {
            throw new IllegalArgumentException("Course ID cannot be empty.");
        }

        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty.");
        }

        if (finalGrade == null || finalGrade.trim().isEmpty()) {
            throw new IllegalArgumentException("Final grade cannot be empty.");
        }

        if (!enrolled) {
            throw new IllegalArgumentException("Student is not enrolled in this course.");
        }

        if (!assessmentsRecorded) {
            throw new IllegalArgumentException("All required assessments must be recorded before submitting the final grade.");
        }

        if (isDuplicateGrade(studentId, courseId)) {
            throw new IllegalArgumentException("Grade already submitted for this student in this course.");
        }

        Grade grade = new Grade(courseId, studentId, finalGrade, enrolled, assessmentsRecorded);
        repository.addGrade(grade);

        return grade;
    }
}
