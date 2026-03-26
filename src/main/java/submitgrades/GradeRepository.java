package submitgrades;

import java.util.ArrayList;

public class GradeRepository {
    private ArrayList<Grade> grades = new ArrayList<>();

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

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