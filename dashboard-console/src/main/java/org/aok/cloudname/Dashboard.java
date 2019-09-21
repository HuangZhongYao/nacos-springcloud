package org.aok.cloudname;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

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
@EnableHystrixDashboard
@SpringBootApplication
public class Dashboard {
    public static void main(String[] args) {
        SpringApplication.run(Dashboard.class,args);
        log.info(" 豪猪 启动成功！ ");
    }
}
