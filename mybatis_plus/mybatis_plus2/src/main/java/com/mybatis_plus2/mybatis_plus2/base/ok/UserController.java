package com.mybatis_plus2.mybatis_plus2.base.ok;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

    @Resource
    private RedisTemplate redisTemplate;

    @PostMapping("/getUserById/{id}")
    public User getUserById(@RequestBody @PathVariable("id") Integer id) {

        User u = (User) redisTemplate.opsForValue().get(id);
        if (u == null) {
            System.out.println("从数据库查询");
            u = userService.getUserById(id);
            redisTemplate.opsForValue().set(u.getId(), u);
        } else {
            System.out.println("从缓存查询");

        }
        return u;
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
