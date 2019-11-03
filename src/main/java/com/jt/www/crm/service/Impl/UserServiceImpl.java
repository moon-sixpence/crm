package com.jt.www.crm.service.Impl;

import com.jt.www.crm.dao.UserDao;
import com.jt.www.crm.model.User;
import com.jt.www.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> findByUserId(String userId) {
        List l = new ArrayList();
        User u =null;
        try{
            l=userDao.findByUserId(userId);
            if(l.size()==0){
                l.add(u);
            }
        }catch (NoSuchElementException e){
            System.out.println("账号不存在可以注册");
        }
        return l;
    }

}
