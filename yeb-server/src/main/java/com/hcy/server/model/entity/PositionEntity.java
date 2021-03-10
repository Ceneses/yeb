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
 * (Position)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_position")
@Accessors(chain = true)
public class PositionEntity implements Serializable {
    private static final long serialVersionUID = -21869789221056237L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 职位
    */
    @TableField("name")
    private String name;

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