package org.aok.cloudname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname
 * @date 2019/9/21
 * @time 14:35
 */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class StartProxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartProxyApplication.class,args);
    }
}
