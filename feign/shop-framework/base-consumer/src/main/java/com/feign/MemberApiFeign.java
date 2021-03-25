package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service-member")
public interface MemberApiFeign {

    @RequestMapping("/getUserList")
    public String getUserList();
}

