package com.mybatis_plus2.mybatis_plus2.base.ok;


import com.baomidou.mybatisplus.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService extends IService<User> {
    User getUserById(int id);

    boolean updateUser(User user);

    boolean insertUser(User user);

    boolean deleteUser(User user);
}
