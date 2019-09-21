package org.aok.cloudname.common.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.aok.cloudname.common.bean.base.EntityBase;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.org.aok.cloudname.common.bean.entity
 * @date 2019/9/20
 * @time 15:31
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo extends EntityBase {

    String lastTime;

    String resources;
}
