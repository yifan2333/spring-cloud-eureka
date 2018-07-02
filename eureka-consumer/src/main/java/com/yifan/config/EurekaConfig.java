package com.yifan.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yifan
 * @since 2018年03月27日
 */
@ComponentScan(value = "com.yifan")
@Configuration
@EnableAutoConfiguration
public class EurekaConfig {
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
