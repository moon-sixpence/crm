package com.jt.www.crm.model;

import lombok.Data;
import org.apache.commons.lang.StringUtils;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.ConstraintMode.CONSTRAINT;
import static javax.persistence.ConstraintMode.NO_CONSTRAINT;

@Entity
@Data
public class Appraise  implements Serializable {
    @Id
    private String Id;//用于课程的唯一性，采用时间生成的随机UUId
    private String AppraiseName;//评价名称
    private String AppraiseType;//评价类型
    private String Classid;//班级ID，用于查询班级信息和学生信息
    private String Userid;//用于查询授课教师信息
    private String Courseid;//用于查询上课科目
    private String Score1;//单项分数
    private String Score2;//单项分数
    private String Score3;//单项分数
    private String Score4;//单项分数
    private String Score5;//单项分数
    private String Score6;//单项分数
    private String Score;//评价汇总分数

    private String teacherName; // 教师姓名

    private String courseName; // 上课科目

    private String className; // 班级名称

    // 关联教师用户信息
    @OneToOne
    @JoinColumn(name="userid",referencedColumnName ="userId",insertable = false, updatable = false,foreignKey =@ForeignKey(NO_CONSTRAINT) )
    private User user;
    @OneToOne
    @JoinColumn(name="classid",referencedColumnName="id", insertable = false, updatable = false,foreignKey =@ForeignKey(NO_CONSTRAINT) )
    private Classes classes;


    @OneToOne
    @JoinColumn(name="courseid",insertable = false, updatable = false,foreignKey =@ForeignKey(NO_CONSTRAINT) )
    private Course course;


    public String getClassName() {
        if ( StringUtils.isNotBlank(className)){
            return  className;

        }
        if (Objects.nonNull(classes)) {
            return  classes.getClassName();
        }
        return  className;
    }

    public String getTeacherName() {
        if (StringUtils.isNotBlank(teacherName)) {
            return teacherName;
        }
        if (Objects.nonNull(user)) {
            return  user.getUserName();
        }
        return teacherName;
    }

    public String getCourseName() {
        if (StringUtils.isNotBlank(courseName)) {
            return courseName;
        }
        if (Objects.nonNull(course)) {
            return  course.getCourseName();
        }
        return courseName;
    }
}
