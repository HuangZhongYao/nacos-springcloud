package org.aok.cloudname.common.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aok.cloudname.common.bean.base.EntityBase;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.bean
 * @date 2019/9/20
 * @time 15:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser extends EntityBase {

    String phone;
    String name;
    String loginName;
    String resources;
}
