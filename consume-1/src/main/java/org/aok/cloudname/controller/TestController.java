package org.aok.cloudname.controller;

import lombok.AllArgsConstructor;
import org.aok.cloudname.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.controller
 * @date 2019/9/20
 * @time 16:35
 */
@RestController
@AllArgsConstructor
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public Object getAll(){
        System.out.println("---");
        return userService.getAll();
    }
}
