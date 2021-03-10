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
 * (Department)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_department")
@Accessors(chain = true)
public class DepartmentEntity implements Serializable {
    private static final long serialVersionUID = -55834410926414260L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 部门名称
    */
    @TableField("name")
    private String name;

    /**
    * 父id
    */
    @TableField("parentid")
    private Integer parentid;

    /**
    * 路径
    */
    @TableField("deppath")
    private String deppath;

    /**
    * 是否启用
    */
    @TableField("enabled")
    private Object enabled;

    /**
    * 是否上级
    */
    @TableField("isparent")
    private Object isparent;
}