package org.aok.cloudname;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangZhongYao
 * @packageName PACKAGE_NAME
 * @date 2019/9/20
 * @time 14:12
 */
@Slf4j
// 注册到 nacos
@EnableDiscoveryClient
// 启用hystrix
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients(basePackages= {"org.aok.*"})
public class Produce_4 {
    public static void main(String[] args) {
        SpringApplication.run(Produce_4.class, args);
    }
}
