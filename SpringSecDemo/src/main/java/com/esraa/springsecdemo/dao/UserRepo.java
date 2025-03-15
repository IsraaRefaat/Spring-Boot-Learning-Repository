package com.esraa.springsecdemo.dao;

import com.esraa.springsecdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

     User findByUsername(String username);

}
