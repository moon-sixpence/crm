package com.jt.www.crm.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Classes {
    @Id
    private String  id;// 用于确定班级唯一性，采用时间生成的随机UUID
    private String classId;// 班级ID
    private String className;// 班级名称


}
