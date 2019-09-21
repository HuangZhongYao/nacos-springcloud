package org.aok.cloudname.service;

import org.aok.cloudname.common.bean.entity.SystemUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserService extends IService<SystemUser> {

    List<SystemUser> getAll();
}
