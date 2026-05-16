package business;
import data.CourseRepository;
import java.util.List;
import java.util.Collection;

/**
 * Service layer class that handles all enrollment business logic.
 */
public class EnrollmentService {
    private CourseRepository courseRepository;
   //  delet private Student currentStudent;
    
    public EnrollmentService() {
        this.courseRepository = new CourseRepository();
       //  delet this.currentStudent = new Student("S001", "John Doe", "Computer Science", 2023);
        // Student has completed Java Programming
      //  delet  this.currentStudent.addCompletedCourse("itcs113");
    }
    //add
    private Student getStudentById(String studentId) {
    Student student = new Student(studentId, "John Doe", "Computer Science", 2023);
    student.addCompletedCourse("itcs113");
    return student;
}
    /**
     * Checks if student has already completed this course
     * @param student The student to check
     * @param courseCode The course to check
     * @return true if student already completed this course
     */
    private boolean hasCompletedCourse(Student student, String courseCode) {
        List<String> completedCourses = student.getCompletedCourses();
        for (String completed : completedCourses) {
            if (completed.equalsIgnoreCase(courseCode)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Validates if a student meets all prerequisite requirements for a course.
     */
    private boolean checkPrerequisites(Student student, Course course) {
        List<String> prerequisites = course.getPrerequisites();
        
        if (prerequisites == null || prerequisites.isEmpty()) {
            return true;
        }
        
        List<String> completedCourses = student.getCompletedCourses();
        
        for (String prerequisite : prerequisites) {
            boolean found = false;
            for (String completed : completedCourses) {
                if (completed.equalsIgnoreCase(prerequisite)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Main enrollment method implementing complete business logic flow.
     */
    public EnrollmentResult enrollInCourse(String studentId, String courseCode) {
           if (studentId == null || studentId.trim().isEmpty() || courseCode == null || courseCode.trim().isEmpty()) {
        return new EnrollmentResult(false,"Student ID and Course Code cannot be empty.");
       
        
    }
       //add
         Student student = getStudentById(studentId);
        
        // Step 1: Validate course existence
        Course course = courseRepository.findCourseByCode(courseCode);
        if (course == null) {
            return new EnrollmentResult(false, "Course not found: " + courseCode);
        }
        
        // Step 2: NEW VALIDATION - Check if student already completed this course
        // if (hasCompletedCourse(currentStudent, courseCode)) {
        if (hasCompletedCourse(student, courseCode)){
            return new EnrollmentResult(false, 
                String.format("Cannot enroll in %s - You have already completed this course.", courseCode));
        }
        
        // Step 3: Check seat availability
        if (!course.hasAvailableSeats()) {
            return new EnrollmentResult(false, 
                String.format("Course %s is full. No seats available.", courseCode));
        }
        
        // Step 4: Prevent duplicate enrollment
        if (courseRepository.isStudentEnrolled(studentId, courseCode)) {
            return new EnrollmentResult(false, 
                "You are already enrolled in this course.");
        }
        
        // Step 5: Verify prerequisites
        //if (!checkPrerequisites(currentStudent, course)) {
        if (!checkPrerequisites(student, course)) {
            return new EnrollmentResult(false, 
                String.format("Prerequisites not met for %s. Required: %s", 
                    courseCode, course.getPrerequisites()));
        }
        
        // Step 6: Process enrollment
        boolean enrolled = courseRepository.enrollStudent(studentId, courseCode);
        
        if (enrolled) {
            return new EnrollmentResult(true, 
                String.format("Successfully enrolled in %s - %s", 
                    courseCode, course.getCourseName()));
        } else {
            return new EnrollmentResult(false, "Enrollment failed due to system error.");
        }
    }
    
    public Collection<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }
    
    /** delet
    public Student getCurrentStudent() {
        return currentStudent;
    }
    
    /**
     * Inner class representing the result of an enrollment operation.
     */
    public static class EnrollmentResult {
        private final boolean success;
        private final String message;
        
        public EnrollmentResult(boolean success, String message) {
            this.success = success;
            this.message = message;
        }
        
        public boolean isSuccess() {
            return success;
        }
        
        public String getMessage() {
            return message;
        }
    }
}
