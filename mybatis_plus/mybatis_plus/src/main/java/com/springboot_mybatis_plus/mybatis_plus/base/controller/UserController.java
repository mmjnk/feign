package com.springboot_mybatis_plus.mybatis_plus.base.controller;

import com.springboot_mybatis_plus.mybatis_plus.base.entity.User;
import com.springboot_mybatis_plus.mybatis_plus.base.entity.UserService;
import com.springboot_mybatis_plus.mybatis_plus.base.entity.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/getUserById")
    public User getUserById(@RequestBody User user) {
        return userService.getUserById(user.getId());

    }



}
