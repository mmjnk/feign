package com.springboot.redis.it.demo.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {
    //用RedisTemplate类来存取对象
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private Student student01, student02;

    @RequestMapping("/student/{id}/{name}/{password}")
    public Student setStudent(@PathVariable("id") String id, @PathVariable("name") String name, @PathVariable("password") String password) {
        student01.setId(Integer.valueOf(id));
        student01.setName(name);
        student01.setPassword(password);
        redisTemplate.opsForValue().set("student_1", student01);//存对象
        student02 = (Student) redisTemplate.opsForValue().get("student_1");//取对象，查看存储是否成功
        System.out.println(student02);
        return student02;
    }
}
