package com.jt.www.crm.service;


import com.jt.www.crm.dao.ClassesDao;
import com.jt.www.crm.model.Appraise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import javax.annotation.Resource;

@Service
public interface AppraiseService {




    public Appraise saveAppraise(Appraise Appraise);
    public Appraise findAppraiseById(String id);
    public Appraise updateAppraise(
            String Appraiseid, String AppraiseName,
            String AppraiseType,String  Classid,String Userid,
            String Courseid,String Score1,String Score2,
            String Score3,String Score4,String Score5,String Score6,String Score);
    public void deleteAppraise(String id);

    /**
     * 分页查询评价列表
     * @param pageNum 当前页
     * @param pageSize 分页大小
     * @return
     */
    Page<Appraise> getAppraiseByPage(Integer pageNum, Integer pageSize);

}
