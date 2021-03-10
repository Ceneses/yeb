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
 * (Oplog)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_oplog")
@Accessors(chain = true)
public class OplogEntity implements Serializable {
    private static final long serialVersionUID = -64020987053134710L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 添加日期
    */
    @TableField("adddate")
    private Object adddate;

    /**
    * 操作内容
    */
    @TableField("operate")
    private String operate;

    /**
    * 操作员ID
    */
    @TableField("adminid")
    private Integer adminid;
}