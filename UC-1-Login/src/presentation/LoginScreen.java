package presentation;

import java.util.Scanner;
import business.LoginService;
import data.User;
import data.UserRepository;

/*
 * Presentation Layer
 * ------------------
 * Handles user input/output for login.
 */
public class LoginScreen {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        LoginService service = new LoginService(repo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("=== Login System ===");
        System.out.println("====================");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = service.authenticate(email, password);
        System.out.println("=====================");
        if (user != null) {
            System.out.println("Login successful! Welcome " + user.getFullName());
            // Show extra info depending on role
            if (user.getRole().equals("Student")) {
                System.out.println("Major: " + user.getMajor());
                System.out.println("GPA: " + user.getGpa());
                System.out.println("======================");
                System.out.println("===Select Service===");
                System.out.println("   Enroll in Course   ");
            } else if (user.getRole().equals("Faculty")) {
                System.out.println("Department: " + user.getDepartment());
                System.out.println("===================");
                System.out.println("===Select Service===");
                System.out.println("   Submit Grade     ");
            } else if (user.getRole().equals("Admin")) {
                System.out.println("===Select Service===");
                System.out.println("     Add Course      ");
            }

        } else {
            System.out.println("Login failed. Invalid email or password.");
        }

        scanner.close();
    }
}
