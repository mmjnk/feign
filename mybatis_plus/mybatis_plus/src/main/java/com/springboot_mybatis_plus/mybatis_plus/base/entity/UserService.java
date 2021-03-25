package com.springboot_mybatis_plus.mybatis_plus.base.entity;

import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {
    User getUserById(int id);
}
