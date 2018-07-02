package com.yifan.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yifan
 * @since 2018年03月27日
 */
@RestController
public class DcController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
