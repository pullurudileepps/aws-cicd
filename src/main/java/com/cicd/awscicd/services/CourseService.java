package com.cicd.awscicd.services;

import com.cicd.awscicd.dtos.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    void addCourse(Course course);
    List<Course> getAllCourses();
    Optional<Course> getCourseById(int id);
    boolean updateCourse(int id, Course newCourse);
    boolean deleteCourse(int id);
}
