package com.yjliao;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Tets {
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }


    public static void main(String[] args) {
        System.out.println(14%3);
    }
}
