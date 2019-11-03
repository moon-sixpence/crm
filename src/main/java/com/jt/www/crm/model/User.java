package com.jt.www.crm.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@GenericGenerator(name ="jpa-uuid",strategy = "uuid")
public class User  implements Serializable {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;               //用于确定用户唯一性，采用时间生成的随机UUID
    private String userId;         //用于用户的登陆与访问
    private String userName;     //用户名
    private String password;   //密码
    private String role;     //用于区分角色，角色有管理员、学生、教师三种
    private String classId;//用于记录学生所属班级



}
