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
 * (EmployeeTrain)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_employee_train")
@Accessors(chain = true)
public class EmployeeTrainEntity implements Serializable {
    private static final long serialVersionUID = -87007752141734313L;

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
    * 培训日期
    */
    @TableField("traindate")
    private Object traindate;

    /**
    * 培训内容
    */
    @TableField("traincontent")
    private String traincontent;

    /**
    * 备注
    */
    @TableField("remark")
    private String remark;
}