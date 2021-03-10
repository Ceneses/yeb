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
 * (EmployeeRemove)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_employee_remove")
@Accessors(chain = true)
public class EmployeeRemoveEntity implements Serializable {
    private static final long serialVersionUID = -31856839844155164L;

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
    * 调动后部门
    */
    @TableField("afterdepid")
    private Integer afterdepid;

    /**
    * 调动后职位
    */
    @TableField("afterjobid")
    private Integer afterjobid;

    /**
    * 调动日期
    */
    @TableField("removedate")
    private Object removedate;

    /**
    * 调动原因
    */
    @TableField("reason")
    private String reason;

    /**
    * 备注
    */
    @TableField("remark")
    private String remark;
}