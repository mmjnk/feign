package com.controller;

import com.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
   @Autowired
   public MemberApiFeign memberApiFeign;
    //方法二，通过feign
    @RequestMapping("/getOrder")
    public String getFeignOrder(){
        return memberApiFeign.getUserList();
    }
}
