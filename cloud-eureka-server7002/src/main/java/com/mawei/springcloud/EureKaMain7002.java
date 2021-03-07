package com.mawei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Maw
 * @Date 2020/12/22 21:03
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EureKaMain7002.class,args);
    }

}
