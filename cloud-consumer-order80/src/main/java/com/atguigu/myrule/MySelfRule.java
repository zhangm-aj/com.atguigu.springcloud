package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//ribbon的服务调用规则定制，由于官网明确说了不能在ComponentScan注解的包和子包下，OrderMain80的SpringBootApplication注解下有
//ComponentScan。所以重新建一个包
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义一个随机调用方式，代替原来默认的轮询方式
    }
}