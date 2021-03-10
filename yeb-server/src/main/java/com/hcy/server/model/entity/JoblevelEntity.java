package com.hcy.server.model.entity;

import java.util.Date;
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
 * (Joblevel)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_joblevel")
@Accessors(chain = true)
public class JoblevelEntity implements Serializable {
    private static final long serialVersionUID = 317048614328391233L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 职称名称
    */
    @TableField("name")
    private String name;

    /**
    * 职称等级
    */
    @TableField("titlelevel")
    private Object titlelevel;

    /**
    * 创建时间
    */
    @TableField("createdate")
    private Date createdate;

    /**
    * 是否启用
    */
    @TableField("enabled")
    private Object enabled;
}