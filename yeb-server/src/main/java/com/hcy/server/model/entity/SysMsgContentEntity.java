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
 * (SysMsgContent)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_sys_msg_content")
@Accessors(chain = true)
public class SysMsgContentEntity implements Serializable {
    private static final long serialVersionUID = -29262856513430481L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 标题
    */
    @TableField("title")
    private String title;

    /**
    * 内容
    */
    @TableField("message")
    private String message;

    /**
    * 创建时间
    */
    @TableField("createdate")
    private Date createdate;
}