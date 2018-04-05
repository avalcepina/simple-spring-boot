package com.example.demo.services.impl;

import com.example.demo.api.model.UserView;
import com.example.demo.persistence.model.User;
import com.example.demo.persistence.repositories.UserRepository;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public void createUser(UserView userView) {

        User user = new User(userView.getUsername(), userView.getFirstName(), userView.getLastName());

        repository.insert(user);

    }
}
