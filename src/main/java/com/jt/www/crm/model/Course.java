package com.jt.www.crm.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Getter
@Setter
    public class Course {
        /**
         * 用于确定课程唯一性
         */
        @Id
        private String id;
        /**
         * 课程ID
         */
        private String courseId;
        /**
         * 课程名称
         */
        private String courseName;
        /**
         * 课程类型
         */
        private String courseType;
        /**
         * 考试类型
         */
        private String examType;
        /**
         * 总课时
         */
        private String totalHours;
        /**
         * 理论课时
         */
        private String theoryHours;
        /**
         * 实践课时
         */
        private String practiceHours;
        /**
         * 上课学期
         */
        private String term;
        /**
         * 上课教师
         */
        private String userId;
    }
