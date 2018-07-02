package com.yifan.dcclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
