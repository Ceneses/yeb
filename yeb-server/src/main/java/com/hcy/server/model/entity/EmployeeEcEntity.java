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
 * (EmployeeEc)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_employee_ec")
@Accessors(chain = true)
public class EmployeeEcEntity implements Serializable {
    private static final long serialVersionUID = 972462008815549828L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 员工编号
    */
    @TableField("eid")
    private Integer eid;

    /**
    * 奖罚日期
    */
    @TableField("ecdate")
    private Object ecdate;

    /**
    * 奖罚原因
    */
    @TableField("ecreason")
    private String ecreason;

    /**
    * 奖罚分
    */
    @TableField("ecpoint")
    private Integer ecpoint;

    /**
    * 奖罚类别，0：奖，1：罚
    */
    @TableField("ectype")
    private Integer ectype;

    /**
    * 备注
    */
    @TableField("remark")
    private String remark;
}