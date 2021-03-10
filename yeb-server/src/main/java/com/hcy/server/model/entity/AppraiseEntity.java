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
 * (Appraise)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_appraise")
@Accessors(chain = true)
public class AppraiseEntity implements Serializable {
    private static final long serialVersionUID = 625950930719137785L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 员工id
    */
    @TableField("eid")
    private Integer eid;

    /**
    * 考评日期
    */
    @TableField("appdate")
    private Object appdate;

    /**
    * 考评结果
    */
    @TableField("appresult")
    private String appresult;

    /**
    * 考评内容
    */
    @TableField("appcontent")
    private String appcontent;

    /**
    * 备注
    */
    @TableField("remark")
    private String remark;
}