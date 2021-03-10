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
 * (Salary)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_salary")
@Accessors(chain = true)
public class SalaryEntity implements Serializable {
    private static final long serialVersionUID = 750880611807523188L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 基本工资
    */
    @TableField("basicsalary")
    private Integer basicsalary;

    /**
    * 奖金
    */
    @TableField("bonus")
    private Integer bonus;

    /**
    * 午餐补助
    */
    @TableField("lunchsalary")
    private Integer lunchsalary;

    /**
    * 交通补助
    */
    @TableField("trafficsalary")
    private Integer trafficsalary;

    /**
    * 应发工资
    */
    @TableField("allsalary")
    private Integer allsalary;

    /**
    * 养老金基数
    */
    @TableField("pensionbase")
    private Integer pensionbase;

    /**
    * 养老金比率
    */
    @TableField("pensionper")
    private Object pensionper;

    /**
    * 启用时间
    */
    @TableField("createdate")
    private Date createdate;

    /**
    * 医疗基数
    */
    @TableField("medicalbase")
    private Integer medicalbase;

    /**
    * 医疗保险比率
    */
    @TableField("medicalper")
    private Object medicalper;

    /**
    * 公积金基数
    */
    @TableField("accumulationfundbase")
    private Integer accumulationfundbase;

    /**
    * 公积金比率
    */
    @TableField("accumulationfundper")
    private Object accumulationfundper;

    /**
    * 名称
    */
    @TableField("name")
    private String name;
}