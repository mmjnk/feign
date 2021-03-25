package com.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class WebController {
    @GetMapping("/a")
    public String fun(){
        return "hello,second day";
    }
    @GetMapping("{id}")
    public String fun2(@PathVariable("id") Integer id){
       return ""+id;

    }
}
