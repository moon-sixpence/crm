package com.jt.www.crm.dao;

import com.jt.www.crm.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDao extends JpaRepository<Student,String> {
}