package com.hcy.server.model.entity;

import java.io.Serializable;
import java.util.Collection;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * (Admin)实体类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_admin")
@ApiModel(value = "Admin对象", description = "")
@Accessors(chain = true)
public class AdminEntity implements Serializable, UserDetails {
    private static final long serialVersionUID = -58786551137794261L;

    /**
    * id
    */
    @TableId(type = IdType.ASSIGN_UUID,value = "id")
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
    * 姓名
    */
    @TableField("name")
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
    * 手机号码
    */
    @TableField("phone")
    @ApiModelProperty(value = "手机号码")
    private String phone;

    /**
    * 住宅电话
    */
    @TableField("telephone")
    @ApiModelProperty(value = "住宅电话")
    private String telephone;

    /**
    * 联系地址
    */
    @TableField("address")
    @ApiModelProperty(value = "联系地址")
    private String address;

    /**
    * 是否启用
    */
    @TableField("enabled")
    @ApiModelProperty(value = "是否启用")
    private boolean enabled;

    /**
    * 用户名
    */
    @TableField("username")
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
    * 密码
    */
    @TableField("password")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
    * 用户头像
    */
    @TableField("userface")
    @ApiModelProperty(value = "用户头像")
    private String userface;

    /**
    * 备注
    */
    @TableField("remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}