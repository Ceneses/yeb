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
 * (SalaryAdjust)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_salary_adjust")
@Accessors(chain = true)
public class SalaryAdjustEntity implements Serializable {
    private static final long serialVersionUID = 976574512166502001L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 员工ID
    */
    @TableField("eid")
    private Integer eid;

    /**
    * 调薪日期
    */
    @TableField("asdate")
    private Object asdate;

    /**
    * 调前薪资
    */
    @TableField("beforesalary")
    private Integer beforesalary;

    /**
    * 调后薪资
    */
    @TableField("aftersalary")
    private Integer aftersalary;

    /**
    * 调薪原因
    */
    @TableField("reason")
    private String reason;

    /**
    * 备注
    */
    @TableField("remark")
    private String remark;
}