package com.mybatis_plus2.mybatis_plus2.base.ok;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/getUserById")
    public User getUserById(@RequestBody User user) {
        return userService.getUserById(user.getId());
    }

    @PostMapping("/getUserByName")
    public User getUserByName(@RequestBody User user) {
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.eq(user != null, "name", user.getName());
        return userService.selectOne(wrapper);
    }

    @RequestMapping("/con")
    public String con() {
        return "成功连接";
    }

    @RequestMapping("/updateUser")
    public boolean updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @RequestMapping("/insertUser")
    public boolean insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @RequestMapping("/deleteUser")
    public boolean deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }
}
