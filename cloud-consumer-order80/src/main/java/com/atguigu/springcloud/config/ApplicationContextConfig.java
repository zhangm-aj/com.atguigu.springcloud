package com.atguigu.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
//通过该实例，客户端可以在controller里面通过getforobject和postforobject直接调用服务器的方法
@Configuration
public class ApplicationContextConfig {
    @Bean
   // @LoadBalanced//负载均衡//测试自己写的的负载均衡时注销
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
