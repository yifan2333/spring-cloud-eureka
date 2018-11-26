package com.yifan.controller;

import com.yifan.dcclient.DcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yifan
 * @since 2018年03月27日
 */
@RestController
public class DcController {

//    @Resource
//    private LoadBalancerClient loadBalancerClient;
//    @Resource
//    private RestTemplate restTemplate;
    @Resource
    private DcClient dcClient;

//    @GetMapping("/consumer")
//    public String dc() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
//        System.out.println(url);
//        return restTemplate.getForObject(url, String.class);
//    }

//    @GetMapping("/consumer2")
//    public String dc2() {
//        return restTemplate.getForObject("http://eureka-client/dc", String.class);
//    }

    @GetMapping("/consumer3")
    public String dc3() {
        return dcClient.consumer();
    }

    @GetMapping("/test")
    public String test() {

        Test test = new Test();
        test.setId(1);
        test.setName("吴一凡");

        return dcClient.post(test);
    }

}
