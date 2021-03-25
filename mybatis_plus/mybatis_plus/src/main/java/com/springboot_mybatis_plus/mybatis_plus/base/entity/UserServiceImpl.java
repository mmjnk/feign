package com.springboot_mybatis_plus.mybatis_plus.base.entity;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public User getUserById(int id) {

        return baseMapper.selectById(id);


    }


}
