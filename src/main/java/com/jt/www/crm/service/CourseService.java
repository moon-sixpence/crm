package com.jt.www.crm.service;

import com.jt.www.crm.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
    public Course saveCourse(Course course);
    public Course findCourseById(String id);
    public Course updateCourse(Course course);
    public void deleteCourse(String id);
    public List<Course> findAll();
}
