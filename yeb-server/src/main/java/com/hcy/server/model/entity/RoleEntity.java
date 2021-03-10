package com.hcy.server.model.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (Role)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_role")
@Accessors(chain = true)
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = 862307104733074308L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 名称
    */
    @TableField("name")
    private String name;

    /**
    * 角色名称
    */
    @TableField("namezh")
    private String namezh;
}