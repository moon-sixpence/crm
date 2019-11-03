package com.jt.www.crm.dao;

import com.jt.www.crm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, String> {
     List<User> findByUserId(String userId);
}
