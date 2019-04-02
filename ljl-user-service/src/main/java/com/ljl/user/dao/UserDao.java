package com.ljl.user.dao;

import com.ljl.user.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
