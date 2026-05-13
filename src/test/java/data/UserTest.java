package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testStudentConstructorAndGetters() {
        User student = new User(
                "student@test.com",
                "1234",
                "Student",
                "Test Student",
                "Computer Science",
                3.7);

        assertEquals("student@test.com", student.getEmail());
        assertEquals("1234", student.getPassword());
        assertEquals("Student", student.getRole());
        assertEquals("Test Student", student.getFullName());
        assertEquals("Computer Science", student.getMajor());
        assertEquals(3.7, student.getGpa());
        assertNull(student.getDepartment());
    }

    @Test
    void testFacultyConstructorAndGetters() {
        User faculty = new User(
                "faculty@test.com",
                "abcd",
                "Faculty",
                "Dr. Test",
                "Information Systems");

        assertEquals("faculty@test.com", faculty.getEmail());
        assertEquals("abcd", faculty.getPassword());
        assertEquals("Faculty", faculty.getRole());
        assertEquals("Dr. Test", faculty.getFullName());
        assertEquals("Information Systems", faculty.getDepartment());
        assertNull(faculty.getMajor());
        assertEquals(0.0, faculty.getGpa());
    }

    @Test
    void testAdminConstructorAndGetters() {
        User admin = new User(
                "admin@test.com",
                "admin123",
                "Admin",
                "System Admin");

        assertEquals("admin@test.com", admin.getEmail());
        assertEquals("admin123", admin.getPassword());
        assertEquals("Admin", admin.getRole());
        assertEquals("System Admin", admin.getFullName());
        assertNull(admin.getMajor());
        assertNull(admin.getDepartment());
        assertEquals(0.0, admin.getGpa());
    }
}
