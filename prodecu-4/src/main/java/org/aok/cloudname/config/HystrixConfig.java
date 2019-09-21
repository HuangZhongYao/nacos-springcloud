package org.aok.cloudname.config;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.config
 * @date 2019/9/20
 * @time 14:31
 */
@Configuration
public class HystrixConfig {

    //用来拦截处理HystrixCommand注解
    @Bean
    public HystrixCommandAspect hystrixAspect() {
        return new HystrixCommandAspect();
    }

    //用来像监控中心Dashboard发送stream信息
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        return registrationBean;
    }

}
