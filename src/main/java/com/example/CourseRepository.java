package com.example;

import java.util.ArrayList;
import java.util.HashMap;
// Data layer class responsible for storing courses
public class CourseRepository {
    private HashMap<String,Course> courses = new HashMap<>();

    // Adds a course to the data storage
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Checks if a course ID already exists
    public boolean existsById(String id) {
        for (Course course : courses) {
            if (course.getCourseId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}
