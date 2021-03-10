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
 * (Employee)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_employee")
@Accessors(chain = true)
public class EmployeeEntity implements Serializable {
    private static final long serialVersionUID = 119827118082325342L;

    /**
    * 员工编号
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 员工姓名
    */
    @TableField("name")
    private String name;

    /**
    * 性别
    */
    @TableField("gender")
    private String gender;

    /**
    * 出生日期
    */
    @TableField("birthday")
    private Object birthday;

    /**
    * 身份证号
    */
    @TableField("idcard")
    private String idcard;

    /**
    * 婚姻状况
    */
    @TableField("wedlock")
    private Object wedlock;

    /**
    * 民族
    */
    @TableField("nationid")
    private Integer nationid;

    /**
    * 籍贯
    */
    @TableField("nativeplace")
    private String nativeplace;

    /**
    * 政治面貌
    */
    @TableField("politicid")
    private Integer politicid;

    /**
    * 邮箱
    */
    @TableField("email")
    private String email;

    /**
    * 电话号码
    */
    @TableField("phone")
    private String phone;

    /**
    * 联系地址
    */
    @TableField("address")
    private String address;

    /**
    * 所属部门
    */
    @TableField("departmentid")
    private Integer departmentid;

    /**
    * 职称ID
    */
    @TableField("joblevelid")
    private Integer joblevelid;

    /**
    * 职位ID
    */
    @TableField("posid")
    private Integer posid;

    /**
    * 聘用形式
    */
    @TableField("engageform")
    private String engageform;

    /**
    * 最高学历
    */
    @TableField("tiptopdegree")
    private Object tiptopdegree;

    /**
    * 所属专业
    */
    @TableField("specialty")
    private String specialty;

    /**
    * 毕业院校
    */
    @TableField("school")
    private String school;

    /**
    * 入职日期
    */
    @TableField("begindate")
    private Object begindate;

    /**
    * 在职状态
    */
    @TableField("workstate")
    private Object workstate;

    /**
    * 工号
    */
    @TableField("workid")
    private String workid;

    /**
    * 合同期限
    */
    @TableField("contractterm")
    private Object contractterm;

    /**
    * 转正日期
    */
    @TableField("conversiontime")
    private Object conversiontime;

    /**
    * 离职日期
    */
    @TableField("notworkdate")
    private Object notworkdate;

    /**
    * 合同起始日期
    */
    @TableField("begincontract")
    private Object begincontract;

    /**
    * 合同终止日期
    */
    @TableField("endcontract")
    private Object endcontract;

    /**
    * 工龄
    */
    @TableField("workage")
    private Integer workage;

    /**
    * 工资账套ID
    */
    @TableField("salaryid")
    private Integer salaryid;
}