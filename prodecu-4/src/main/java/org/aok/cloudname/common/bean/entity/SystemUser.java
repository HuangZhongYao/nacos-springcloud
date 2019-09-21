package org.aok.cloudname.common.bean.entity;

import org.aok.cloudname.common.bean.base.EntityBase;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.bean
 * @date 2019/9/20
 * @time 15:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class SystemUser extends EntityBase {

    String phone;
    String name;
    String loginName;
    String resources;
}
