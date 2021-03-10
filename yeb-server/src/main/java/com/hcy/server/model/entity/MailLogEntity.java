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
 * (MailLog)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_mail_log")
@Accessors(chain = true)
public class MailLogEntity implements Serializable {
    private static final long serialVersionUID = 652358036825442525L;

    /**
    * 消息id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private String msgid;

    /**
    * 接收员工id
    */
    @TableField("eid")
    private Integer eid;

    /**
    * 状态（0:消息投递中 1:投递成功 2:投递失败）
    */
    @TableField("status")
    private Integer status;

    /**
    * 路由键
    */
    @TableField("routekey")
    private String routekey;

    /**
    * 交换机
    */
    @TableField("exchange")
    private String exchange;

    /**
    * 重试次数
    */
    @TableField("count")
    private Integer count;

    /**
    * 重试时间
    */
    @TableField("trytime")
    private Date trytime;

    /**
    * 创建时间
    */
    @TableField("createtime")
    private Date createtime;

    /**
    * 更新时间
    */
    @TableField("updatetime")
    private Date updatetime;
}