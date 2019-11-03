package com.jt.www.crm.service.Impl;

import com.jt.www.crm.dao.AppraiseDao;
import com.jt.www.crm.dao.ClassesDao;
import com.jt.www.crm.model.Appraise;
import com.jt.www.crm.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppraiseServicelmpl implements AppraiseService {
    @Autowired
    private AppraiseDao AppraiseDao;
    @Autowired
    private ClassesDao classesdao ;


    @Override
    public Appraise saveAppraise(Appraise Appraise) {

        return AppraiseDao.save(Appraise);
    }

    @Override
    public Appraise findAppraiseById(String id) {
        return AppraiseDao.findById(id).get();

    }

    @Override
    public Appraise updateAppraise(String Appraiseid, String AppraiseName, String AppraiseType, String Classid, String Userid, String Courseid, String Score1, String Score2, String Score3, String Score4, String Score5, String Score6, String Score) {
        return null;
    }

    @Override
    public void deleteAppraise(String id) {
      AppraiseDao.findById(id);
    }
}
