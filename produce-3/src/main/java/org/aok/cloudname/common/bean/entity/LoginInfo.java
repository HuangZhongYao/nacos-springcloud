package org.aok.cloudname.common.bean.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.aok.cloudname.common.bean.base.EntityBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
@TableName("sys_user_login")
public class LoginInfo extends EntityBase {

    String lastTime;

    String resources;
}
