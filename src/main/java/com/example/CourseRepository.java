package com.example;
import java.util.HashMap; //added
import java.util.ArrayList;
import java.util.HashMap;
// Data layer class responsible for storing courses
public class CourseRepository {
    private HashMap<String,Course> courses = new HashMap<>(); //HashMap instaed of ArrayList

    // Adds a course to the data storage
    public void addCourse(Course course) {
        courses.put(course.getCourseId().toLowerCase(),course);
    }

    // Checks if a course ID already exists
    public boolean existsById(String id) {
        return courses.containsKey(id.toLowerCase());
    }
}
