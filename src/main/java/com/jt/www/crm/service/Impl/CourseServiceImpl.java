package com.jt.www.crm.service.Impl;
import com.jt.www.crm.dao.CourseDao;
import com.jt.www.crm.model.Course;
import com.jt.www.crm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;


    @Override
    public Course saveCourse(Course course) {
//        return courseDao.saveAll(course);
        return null;
    }

    @Override
    public Course findCourseById(String id) {
        return null;
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(String id) {

    }

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }
}
