package com.ezerbel.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: EzerbelCN
 * @Date: 2020/7/24 20:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class MainAppConfigCenter3344 {
    public static void main(String[] args){
        SpringApplication.run(MainAppConfigCenter3344.class,args);
    }
}
