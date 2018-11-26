package com.yifan.dcclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yifan.controller.Test;

@FeignClient(value = "eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

    @PostMapping("/post")
    String post(@RequestBody Test test);

}
