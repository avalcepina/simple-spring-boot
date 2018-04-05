package com.example.demo.services;

import com.example.demo.api.model.UserView;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public void createUser(UserView user);

}
