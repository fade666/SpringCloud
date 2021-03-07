package com.mawei.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Maw
 * @Date 2021/1/12 22:45
 * @Version 1.0
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}

