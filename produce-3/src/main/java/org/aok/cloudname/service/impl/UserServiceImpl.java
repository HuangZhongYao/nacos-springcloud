package org.aok.cloudname.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.aok.cloudname.common.bean.entity.SystemUser;
import org.aok.cloudname.service.UserService;
import org.aok.cloudname.service.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.service.impl
 * @date 2019/9/20
 * @time 16:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,SystemUser> implements UserService {
    public List<SystemUser> getAll() {
        return baseMapper.selectByMap(null);
    }
}
