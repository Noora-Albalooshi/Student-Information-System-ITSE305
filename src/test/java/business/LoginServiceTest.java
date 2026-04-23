package business;

import data.User;
import data.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    void testAuthenticateValidStudent() {
        UserRepository repo = new UserRepository();
        LoginService service = new LoginService(repo);

        User user = service.authenticate("ali@student.edu", "pass123");

        assertNotNull(user);
        assertEquals("ali@student.edu", user.getEmail());
        assertEquals("Student", user.getRole());
        assertEquals("Ali Ahmed", user.getFullName());
    }

    @Test
    void testAuthenticateValidFaculty() {
        UserRepository repo = new UserRepository();
        LoginService service = new LoginService(repo);

        User user = service.authenticate("hassan@faculty.edu", "teach789");

        assertNotNull(user);
        assertEquals("Faculty", user.getRole());
        assertEquals("Dr. Hassan Ali", user.getFullName());
        assertEquals("Computer Science", user.getDepartment());
    }

    @Test
    void testAuthenticateValidAdmin() {
        UserRepository repo = new UserRepository();
        LoginService service = new LoginService(repo);

        User user = service.authenticate("admin@system.edu", "admin999");

        assertNotNull(user);
        assertEquals("Admin", user.getRole());
        assertEquals("System Administrator", user.getFullName());
    }

    @Test
    void testAuthenticateWrongPassword() {
        UserRepository repo = new UserRepository();
        LoginService service = new LoginService(repo);

        User user = service.authenticate("ali@student.edu", "wrongpass");

        assertNull(user);
    }

    @Test
    void testAuthenticateUnknownEmail() {
        UserRepository repo = new UserRepository();
        LoginService service = new LoginService(repo);

        User user = service.authenticate("unknown@student.edu", "pass123");

        assertNull(user);
    }
    @Test
    void testIntentionalFailure() {
    UserRepository repo = new UserRepository();
    LoginService service = new LoginService(repo);
    
    // BUG: This assertion will FAIL
    // "ali@student.edu" with password "pass123" returns a user, NOT null
    User user = service.authenticate("ali@student.edu", "pass123");
    assertNull(user);  // This is WRONG – the user exists!
}
}
