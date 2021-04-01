package com.mybatis_plus2.mybatis_plus2.base.ok;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public User getUserById(int id) {
        return selectById(id);
    }

    @Override
    public boolean updateUser(User user) {
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.eq("id", user.getId());
        return update(user, wrapper);
    }

    @Override
    public boolean insertUser(User user) {
        return insert(user);
    }

    @Override
    public boolean deleteUser(User user) {
        return deleteById(user);
    }
}
