package com.jt.www.crm.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
public class Appraise {
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
    @Override
    public String toString() {
        return "Appraise{" +
                "Id='" + Id + '\'' +
                ", AppraiseName='" + AppraiseName + '\'' +
                ", AppraiseType='" + AppraiseType + '\'' +
                ", Classid='" + Classid + '\'' +
                ", Userid='" + Userid + '\'' +
                ", Courseid='" + Courseid + '\'' +
                ", Score1='" + Score1 + '\'' +
                ", Score2='" + Score2 + '\'' +
                ", Score3='" + Score3 + '\'' +
                ", Score4='" + Score4 + '\'' +
                ", Score5='" + Score5 + '\'' +
                ", Score6='" + Score6 + '\'' +
                ", Score='" + Score + '\'' +
                '}';
    }


}
