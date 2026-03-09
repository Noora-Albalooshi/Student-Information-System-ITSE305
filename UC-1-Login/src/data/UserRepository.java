package data;

/**
 * Stores a dataset of sample student, faculty, and admin accounts.
 */
public class UserRepository {
    private User[] users = {
            new User("ali@student.edu", "pass123", "Student", "Ali Ahmed", "Computer Science", 3.5),
            new User("noora@student.edu", "hello456", "Student", "Noora Albalooshi", "Information Systems", 3.8),
            new User("hassan@faculty.edu", "teach789", "Faculty", "Dr. Hassan Ali", "Computer Science"),
            new User("mariam@faculty.edu", "abc123", "Faculty", "Dr. Mariam Yusuf", "Information Systems"),
            new User("admin@system.edu", "admin999", "Admin", "System Administrator")
    };

    public User getUserByEmail(String email) {
        for (User u : users) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
}
