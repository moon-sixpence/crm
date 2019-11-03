package com.jt.www.crm.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    private String sid;
    private String spassword;
    private int role;//用户角色    1为管理员，2为教师，3为学生

    @Override
    public String toString() {
        return "student{" +
                "sid='" + sid + '\'' +
                ", spassword='" + spassword + '\'' +
                ", role=" + role +
                '}';
    }
}
