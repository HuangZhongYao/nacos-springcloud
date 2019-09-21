package org.aok.cloudname.controller;

import lombok.AllArgsConstructor;
import org.aok.cloudname.service.UserService;
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
    public Object getAll(){
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("data",userService.getAll());
        hashMap.put("rusources","三号");
        return hashMap;
    }
}
