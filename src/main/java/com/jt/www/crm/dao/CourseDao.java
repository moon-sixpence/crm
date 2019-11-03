package com.jt.www.crm.dao;


import com.jt.www.crm.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,String> {
}
