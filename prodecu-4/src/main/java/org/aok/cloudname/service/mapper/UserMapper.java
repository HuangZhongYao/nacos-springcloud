package org.aok.cloudname.service.mapper;

import org.aok.cloudname.common.bean.entity.SystemUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.service.mapper
 * @date 2019/9/20
 * @time 16:16
 */
@Mapper
public interface UserMapper extends BaseMapper<SystemUser> {
}
