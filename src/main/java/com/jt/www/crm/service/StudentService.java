package com.jt.www.crm.service;

import com.jt.www.crm.model.Student;

public interface StudentService {
    public Student saveStudent(Student u);
    public Student findStudentById(String sid);
    public void deleteStudent(String sid);
    public void updateStudent(String sid, String spassword);

}
