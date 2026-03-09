package data;

/**
 * Represents a user with email, password, role, full name, and extra info.
 */
public class User {
    private String email;
    private String password;
    private String role; // Student, Faculty, or Admin
    private String fullName;
    private String major; // for students
    private double gpa; // for students
    private String department; // for faculty

    // Student constructor
    public User(String email, String password, String role, String fullName, String major, double gpa) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
        this.major = major;
        this.gpa = gpa;
    }

    // Faculty constructor
    public User(String email, String password, String role, String fullName, String department) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
        this.department = department;
    }

    // Admin constructor
    public User(String email, String password, String role, String fullName) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDepartment() {
        return department;
    }
}
