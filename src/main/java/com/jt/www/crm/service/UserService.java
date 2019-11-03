package com.jt.www.crm.service;

import com.jt.www.crm.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findByUserId(String userId);

}
