package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void testGetExistingStudentByEmail() {
        UserRepository repo = new UserRepository();

        User user = repo.getUserByEmail("ali@student.edu");

        assertNotNull(user);
        assertEquals("Ali Ahmed", user.getFullName());
        assertEquals("Student", user.getRole());
        assertEquals("Computer Science", user.getMajor());
        assertEquals(3.5, user.getGpa());
    }

    @Test
    void testGetExistingFacultyByEmail() {
        UserRepository repo = new UserRepository();

        User user = repo.getUserByEmail("hassan@faculty.edu");

        assertNotNull(user);
        assertEquals("Faculty", user.getRole());
        assertEquals("Dr. Hassan Ali", user.getFullName());
        assertEquals("Computer Science", user.getDepartment());
    }

    @Test
    void testGetExistingAdminByEmail() {
        UserRepository repo = new UserRepository();

        User user = repo.getUserByEmail("admin@system.edu");

        assertNotNull(user);
        assertEquals("Admin", user.getRole());
        assertEquals("System Administrator", user.getFullName());
    }

    @Test
    void testGetUserByUnknownEmail() {
        UserRepository repo = new UserRepository();

        User user = repo.getUserByEmail("notfound@test.com");

        assertNull(user);
    }
}
