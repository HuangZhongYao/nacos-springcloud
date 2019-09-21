package org.aok.cloudname.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.feign
 * @date 2019/9/20
 * @time 16:29
 */
@FeignClient(value = "produce-3")
public interface UserService {

    @GetMapping("/getAll")
    Object getAll();



}
