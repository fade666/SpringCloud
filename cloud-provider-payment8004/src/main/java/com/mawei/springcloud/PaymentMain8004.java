package com.mawei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Maw
 * @Date 2021/1/11 22:16
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //用console或者zookpeer作为注册中心时注册服务的注解 //@EnableEurekaClient是Eureka的注解
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
