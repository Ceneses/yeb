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
 * (SysMsg)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_sys_msg")
@Accessors(chain = true)
public class SysMsgEntity implements Serializable {
    private static final long serialVersionUID = 910721666648347230L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 消息id
    */
    @TableField("mid")
    private Integer mid;

    /**
    * 0表示群发消息
    */
    @TableField("type")
    private Integer type;

    /**
    * 这条消息是给谁的
    */
    @TableField("adminid")
    private Integer adminid;

    /**
    * 0 未读 1 已读
    */
    @TableField("state")
    private Integer state;
}