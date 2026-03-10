import java.util.ArrayList;

// Data layer class responsible for storing grades
public class GradeRepository {
    private ArrayList<Grade> grades = new ArrayList<>();

    // Adds a grade to the data storage
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    // Checks if a grade was already submitted for the same student in the same course
    public boolean existsByStudentAndCourse(String studentId, String courseId) {
        for (Grade grade : grades) {
            if (grade.getStudentId().equalsIgnoreCase(studentId)
                    && grade.getCourseId().equalsIgnoreCase(courseId)) {
                return true;
            }
        }
        return false;
    }
}