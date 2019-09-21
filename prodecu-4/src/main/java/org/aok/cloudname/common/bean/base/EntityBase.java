package org.aok.cloudname.common.bean.base;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author huangZhongYao
 * @packageName org.aok.cloudname.org.aok.cloudname.common.bean
 * @date 2019/9/20
 * @time 15:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EntityBase implements Serializable {

    @TableId
    Integer id;
}
