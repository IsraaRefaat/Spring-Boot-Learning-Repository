package com.esraa.springsecdemo.service;

import com.esraa.springsecdemo.dao.UserRepo;
import com.esraa.springsecdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public User saveUser(User user) {
        return repo.save(user);
    }
}
