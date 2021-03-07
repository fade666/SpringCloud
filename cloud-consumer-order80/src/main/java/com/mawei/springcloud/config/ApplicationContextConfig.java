package com.mawei.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Maw
 * @Date 2020/12/16 22:06
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig  {
    @Bean
    @LoadBalanced //给RestTemplate赋予负载均很的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
