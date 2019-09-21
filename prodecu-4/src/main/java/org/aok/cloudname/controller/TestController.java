package org.aok.cloudname.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.aok.cloudname.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname
 * @date 2019/9/20
 * @time 16:33
 */
@RestController
@AllArgsConstructor
public class TestController {

    UserService userService;

    @GetMapping("/getAll")
    @HystrixCommand(fallbackMethod = "back")//方法执行出异常调用方法
    public Object getAll(){
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("data",userService.getAll());
        hashMap.put("rusources","四号 wind10");
        return hashMap;
    }


    public Object back(){
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("message","执行出错！");
        return hashMap;
    }
}
