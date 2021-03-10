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
 * (Menu)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_menu")
@Accessors(chain = true)
public class MenuEntity implements Serializable {
    private static final long serialVersionUID = 145054810306914486L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * url
    */
    @TableField("url")
    private String url;

    /**
    * path
    */
    @TableField("path")
    private String path;

    /**
    * 组件
    */
    @TableField("component")
    private String component;

    /**
    * 菜单名
    */
    @TableField("name")
    private String name;

    /**
    * 图标
    */
    @TableField("iconcls")
    private String iconcls;

    /**
    * 是否保持激活
    */
    @TableField("keepalive")
    private Object keepalive;

    /**
    * 是否要求权限
    */
    @TableField("requireauth")
    private Object requireauth;

    /**
    * 父id
    */
    @TableField("parentid")
    private Integer parentid;

    /**
    * 是否启用
    */
    @TableField("enabled")
    private Object enabled;
}