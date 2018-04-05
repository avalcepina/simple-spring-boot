package com.example.demo.api.controllers;

import com.example.demo.api.model.ResponseView;
import com.example.demo.api.model.StatusEnum;
import com.example.demo.api.model.UserView;
import com.example.demo.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class APIController {

    public static final Logger logger = LoggerFactory.getLogger(APIController.class);

    @Autowired
    private UserService service;

    @RequestMapping(value = "/health", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody StatusEnum healthCheck() {

        return StatusEnum.HEALTHY;

    }

    @RequestMapping(value = "/ready", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody StatusEnum readyCheck() {

        return StatusEnum.READY;

    }


    @RequestMapping(value = "/users", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseView createUser(@RequestBody UserView user) {

        service.createUser(user);

        return new ResponseView("User created");

    }

}
