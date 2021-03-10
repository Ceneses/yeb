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
 * (PoliticsStatus)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_politics_status")
@Accessors(chain = true)
public class PoliticsStatusEntity implements Serializable {
    private static final long serialVersionUID = 804394466203191930L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    private Integer id;

    /**
    * 政治面貌
    */
    @TableField("name")
    private String name;
}